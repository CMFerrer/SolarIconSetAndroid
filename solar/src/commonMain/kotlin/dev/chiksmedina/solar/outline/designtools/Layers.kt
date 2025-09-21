package dev.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.DesignToolsGroup

val DesignToolsGroup.Layers: ImageVector
    get() {
        if (_layers != null) {
            return _layers!!
        }
        _layers = Builder(
            name = "Layers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 4.75f)
                curveTo(10.9396f, 4.75f, 10.0907f, 5.078f, 8.0658f, 5.8879f)
                lineTo(5.2574f, 7.0113f)
                curveTo(4.2469f, 7.4155f, 3.5468f, 7.6966f, 3.093f, 7.9345f)
                curveTo(3.0486f, 7.9578f, 3.0086f, 7.9796f, 2.9727f, 8.0f)
                curveTo(3.0086f, 8.0204f, 3.0486f, 8.0422f, 3.093f, 8.0655f)
                curveTo(3.5468f, 8.3034f, 4.2469f, 8.5845f, 5.2574f, 8.9887f)
                lineTo(8.0658f, 10.1121f)
                curveTo(10.0907f, 10.922f, 10.9396f, 11.25f, 12.0f, 11.25f)
                curveTo(13.0604f, 11.25f, 13.9093f, 10.922f, 15.9342f, 10.1121f)
                lineTo(18.7426f, 8.9887f)
                curveTo(19.7531f, 8.5845f, 20.4532f, 8.3034f, 20.9071f, 8.0655f)
                curveTo(20.9514f, 8.0422f, 20.9914f, 8.0204f, 21.0273f, 8.0f)
                curveTo(20.9914f, 7.9796f, 20.9514f, 7.9578f, 20.9071f, 7.9345f)
                curveTo(20.4532f, 7.6966f, 19.7531f, 7.4155f, 18.7426f, 7.0113f)
                lineTo(15.9342f, 5.8879f)
                curveTo(13.9093f, 5.078f, 13.0604f, 4.75f, 12.0f, 4.75f)
                close()
                moveTo(7.6244f, 4.4489f)
                curveTo(9.5012f, 3.698f, 10.6208f, 3.25f, 12.0f, 3.25f)
                curveTo(13.3792f, 3.25f, 14.4988f, 3.698f, 16.3756f, 4.4489f)
                curveTo(16.4138f, 4.4642f, 16.4524f, 4.4796f, 16.4912f, 4.4952f)
                lineTo(19.3451f, 5.6367f)
                curveTo(20.2996f, 6.0185f, 21.0728f, 6.3278f, 21.6035f, 6.606f)
                curveTo(21.8721f, 6.7468f, 22.1323f, 6.9065f, 22.333f, 7.0989f)
                curveTo(22.5392f, 7.2967f, 22.75f, 7.5966f, 22.75f, 8.0f)
                curveTo(22.75f, 8.4034f, 22.5392f, 8.7033f, 22.333f, 8.9011f)
                curveTo(22.1323f, 9.0935f, 21.8721f, 9.2532f, 21.6035f, 9.394f)
                curveTo(21.2519f, 9.5784f, 20.7938f, 9.7763f, 20.247f, 10.0f)
                curveTo(20.7938f, 10.2237f, 21.2519f, 10.4216f, 21.6035f, 10.606f)
                curveTo(21.8721f, 10.7468f, 22.1323f, 10.9065f, 22.333f, 11.0989f)
                curveTo(22.5392f, 11.2967f, 22.75f, 11.5966f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4034f, 22.5392f, 12.7033f, 22.333f, 12.9011f)
                curveTo(22.1323f, 13.0935f, 21.8721f, 13.2532f, 21.6035f, 13.394f)
                curveTo(21.2519f, 13.5784f, 20.7938f, 13.7763f, 20.247f, 14.0f)
                curveTo(20.7938f, 14.2237f, 21.2519f, 14.4216f, 21.6035f, 14.606f)
                curveTo(21.8721f, 14.7468f, 22.1323f, 14.9065f, 22.333f, 15.0989f)
                curveTo(22.5392f, 15.2967f, 22.75f, 15.5966f, 22.75f, 16.0f)
                curveTo(22.75f, 16.4034f, 22.5392f, 16.7033f, 22.333f, 16.9011f)
                curveTo(22.1323f, 17.0935f, 21.8721f, 17.2532f, 21.6035f, 17.394f)
                curveTo(21.0728f, 17.6722f, 20.2997f, 17.9815f, 19.3451f, 18.3633f)
                lineTo(16.4912f, 19.5048f)
                curveTo(16.4524f, 19.5204f, 16.4138f, 19.5358f, 16.3756f, 19.5511f)
                curveTo(14.4988f, 20.302f, 13.3792f, 20.75f, 12.0f, 20.75f)
                curveTo(10.6208f, 20.75f, 9.5012f, 20.302f, 7.6244f, 19.5511f)
                curveTo(7.5862f, 19.5358f, 7.5476f, 19.5204f, 7.5087f, 19.5048f)
                lineTo(4.6549f, 18.3633f)
                curveTo(3.7003f, 17.9815f, 2.9272f, 17.6722f, 2.3965f, 17.394f)
                curveTo(2.1279f, 17.2532f, 1.8677f, 17.0935f, 1.667f, 16.9011f)
                curveTo(1.4609f, 16.7033f, 1.25f, 16.4034f, 1.25f, 16.0f)
                curveTo(1.25f, 15.5966f, 1.4609f, 15.2967f, 1.667f, 15.0989f)
                curveTo(1.8677f, 14.9065f, 2.1279f, 14.7468f, 2.3965f, 14.606f)
                curveTo(2.7481f, 14.4216f, 3.2062f, 14.2237f, 3.753f, 14.0f)
                curveTo(3.2062f, 13.7763f, 2.7481f, 13.5784f, 2.3965f, 13.394f)
                curveTo(2.1279f, 13.2532f, 1.8677f, 13.0935f, 1.667f, 12.9011f)
                curveTo(1.4609f, 12.7033f, 1.25f, 12.4034f, 1.25f, 12.0f)
                curveTo(1.25f, 11.5966f, 1.4609f, 11.2967f, 1.667f, 11.0989f)
                curveTo(1.8677f, 10.9065f, 2.1279f, 10.7468f, 2.3965f, 10.606f)
                curveTo(2.7481f, 10.4216f, 3.2062f, 10.2237f, 3.753f, 10.0f)
                curveTo(3.2062f, 9.7763f, 2.7481f, 9.5784f, 2.3965f, 9.394f)
                curveTo(2.1279f, 9.2532f, 1.8677f, 9.0935f, 1.667f, 8.9011f)
                curveTo(1.4609f, 8.7033f, 1.25f, 8.4034f, 1.25f, 8.0f)
                curveTo(1.25f, 7.5966f, 1.4609f, 7.2967f, 1.667f, 7.0989f)
                curveTo(1.8677f, 6.9065f, 2.1279f, 6.7468f, 2.3965f, 6.606f)
                curveTo(2.9272f, 6.3278f, 3.7004f, 6.0185f, 4.655f, 5.6367f)
                lineTo(7.5087f, 4.4952f)
                curveTo(7.5476f, 4.4796f, 7.5862f, 4.4642f, 7.6244f, 4.4489f)
                close()
                moveTo(5.7661f, 10.8078f)
                lineTo(5.2574f, 11.0113f)
                curveTo(4.2469f, 11.4154f, 3.5468f, 11.6966f, 3.093f, 11.9345f)
                curveTo(3.0486f, 11.9578f, 3.0086f, 11.9796f, 2.9727f, 12.0f)
                curveTo(3.0086f, 12.0204f, 3.0486f, 12.0422f, 3.093f, 12.0655f)
                curveTo(3.5468f, 12.3034f, 4.2469f, 12.5845f, 5.2574f, 12.9887f)
                lineTo(8.0658f, 14.1121f)
                curveTo(10.0907f, 14.922f, 10.9396f, 15.25f, 12.0f, 15.25f)
                curveTo(13.0604f, 15.25f, 13.9093f, 14.922f, 15.9342f, 14.1121f)
                lineTo(18.7426f, 12.9887f)
                curveTo(19.7531f, 12.5845f, 20.4532f, 12.3034f, 20.9071f, 12.0655f)
                curveTo(20.9514f, 12.0422f, 20.9914f, 12.0204f, 21.0273f, 12.0f)
                curveTo(20.9914f, 11.9796f, 20.9514f, 11.9578f, 20.9071f, 11.9345f)
                curveTo(20.4532f, 11.6966f, 19.7531f, 11.4154f, 18.7426f, 11.0113f)
                lineTo(18.2339f, 10.8078f)
                lineTo(16.4912f, 11.5048f)
                curveTo(16.4524f, 11.5204f, 16.4138f, 11.5358f, 16.3756f, 11.5511f)
                curveTo(14.4988f, 12.302f, 13.3792f, 12.75f, 12.0f, 12.75f)
                curveTo(10.6208f, 12.75f, 9.5012f, 12.302f, 7.6244f, 11.5511f)
                curveTo(7.5862f, 11.5358f, 7.5476f, 11.5204f, 7.5087f, 11.5048f)
                lineTo(5.7661f, 10.8078f)
                close()
                moveTo(5.7661f, 14.8078f)
                lineTo(5.2574f, 15.0113f)
                curveTo(4.2469f, 15.4154f, 3.5468f, 15.6966f, 3.093f, 15.9345f)
                curveTo(3.0486f, 15.9578f, 3.0086f, 15.9796f, 2.9727f, 16.0f)
                curveTo(3.0086f, 16.0204f, 3.0486f, 16.0422f, 3.093f, 16.0655f)
                curveTo(3.5468f, 16.3034f, 4.2469f, 16.5845f, 5.2574f, 16.9887f)
                lineTo(8.0658f, 18.1121f)
                curveTo(10.0907f, 18.922f, 10.9396f, 19.25f, 12.0f, 19.25f)
                curveTo(13.0604f, 19.25f, 13.9093f, 18.922f, 15.9342f, 18.1121f)
                lineTo(18.7426f, 16.9887f)
                curveTo(19.7531f, 16.5845f, 20.4532f, 16.3034f, 20.9071f, 16.0655f)
                curveTo(20.9514f, 16.0422f, 20.9914f, 16.0204f, 21.0273f, 16.0f)
                curveTo(20.9914f, 15.9796f, 20.9514f, 15.9578f, 20.9071f, 15.9345f)
                curveTo(20.4532f, 15.6966f, 19.7531f, 15.4154f, 18.7426f, 15.0113f)
                lineTo(18.2339f, 14.8078f)
                lineTo(16.4912f, 15.5048f)
                curveTo(16.4524f, 15.5204f, 16.4138f, 15.5358f, 16.3756f, 15.5511f)
                curveTo(14.4988f, 16.302f, 13.3792f, 16.75f, 12.0f, 16.75f)
                curveTo(10.6208f, 16.75f, 9.5012f, 16.302f, 7.6244f, 15.5511f)
                curveTo(7.5862f, 15.5358f, 7.5476f, 15.5204f, 7.5087f, 15.5048f)
                lineTo(5.7661f, 14.8078f)
                close()
            }
        }
            .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
