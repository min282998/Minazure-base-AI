package com.example.addon;

import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.events.world.BlockUpdateEvent;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;

public class ExampleAddon extends Module {
    public ExampleAddon() {
        // Tên Module sẽ hiển thị trong Menu Meteor là Minazure
        super(Categories.World, "Minazure", "AI tự động dò tìm tọa độ Base người chơi.");
    }

    @EventHandler
    private void onBlockUpdate(BlockUpdateEvent event) {
        BlockPos pos = event.pos;
        Block block = event.newState.getBlock();

        // Danh sách các khối "đặc trưng" của Base người chơi (Chest, Shulker, Spawner, v.v.)
        if (block == Blocks.CHEST || 
            block == Blocks.TRAPPED_CHEST || 
            block == Blocks.BARREL || 
            block == Blocks.SHULKER_BOX || 
            block == Blocks.ENDER_CHEST ||
            block == Blocks.SPAWNER) {
            
            // Thông báo tọa độ thẳng vào khung chat (chỉ mình bạn thấy)
            info("🎯 [Minazure] Phát hiện vật phẩm Base tại: " + pos.getX() + ", " + pos.getY() + ", " + pos.getZ());
        }
    }
}
