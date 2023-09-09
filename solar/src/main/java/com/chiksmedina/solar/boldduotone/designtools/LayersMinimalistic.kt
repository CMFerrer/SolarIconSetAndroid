package com.chiksmedina.solar.boldduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

public val DesignToolsGroup.LayersMinimalistic: ImageVector
    get() {
        if (_layersMinimalistic != null) {
            return _layersMinimalistic!!
        }
        _layersMinimalistic = Builder(name = "LayersMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6244f, 4.4489f)
                curveTo(9.5012f, 3.698f, 10.6208f, 3.25f, 12.0f, 3.25f)
                curveTo(13.3792f, 3.25f, 14.4988f, 3.698f, 16.3756f, 4.4489f)
                lineTo(19.3451f, 5.6367f)
                curveTo(20.2996f, 6.0185f, 21.0728f, 6.3278f, 21.6035f, 6.606f)
                curveTo(21.8721f, 6.7468f, 22.1323f, 6.9065f, 22.333f, 7.0989f)
                curveTo(22.5392f, 7.2967f, 22.75f, 7.5966f, 22.75f, 8.0f)
                curveTo(22.75f, 8.4034f, 22.5392f, 8.7033f, 22.333f, 8.9011f)
                curveTo(22.1323f, 9.0935f, 21.8721f, 9.2532f, 21.6035f, 9.394f)
                curveTo(21.0728f, 9.6722f, 20.2996f, 9.9815f, 19.3451f, 10.3633f)
                lineTo(16.3756f, 11.5511f)
                curveTo(14.4988f, 12.302f, 13.3792f, 12.75f, 12.0f, 12.75f)
                curveTo(10.6208f, 12.75f, 9.5012f, 12.302f, 7.6244f, 11.5511f)
                lineTo(4.655f, 10.3633f)
                curveTo(3.7004f, 9.9815f, 2.9272f, 9.6722f, 2.3965f, 9.394f)
                curveTo(2.1279f, 9.2532f, 1.8677f, 9.0935f, 1.667f, 8.9011f)
                curveTo(1.4609f, 8.7033f, 1.25f, 8.4034f, 1.25f, 8.0f)
                curveTo(1.25f, 7.5966f, 1.4609f, 7.2967f, 1.667f, 7.0989f)
                curveTo(1.8677f, 6.9065f, 2.1279f, 6.7468f, 2.3965f, 6.606f)
                curveTo(2.9272f, 6.3278f, 3.7004f, 6.0185f, 4.655f, 5.6367f)
                lineTo(7.6244f, 4.4489f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                    = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5025f, 11.4432f)
                lineTo(2.499f, 11.4402f)
                curveTo(2.1906f, 11.1654f, 1.7176f, 11.1915f, 1.4416f, 11.4992f)
                curveTo(1.165f, 11.8075f, 1.191f, 12.282f, 1.4994f, 12.5586f)
                curveTo(1.4994f, 12.5586f, 1.4991f, 12.5583f, 1.9999f, 12.0f)
                lineTo(1.4994f, 12.5586f)
                lineTo(1.5004f, 12.5595f)
                lineTo(1.5022f, 12.5611f)
                lineTo(1.5068f, 12.5652f)
                lineTo(1.5205f, 12.5772f)
                curveTo(1.5316f, 12.5868f, 1.5467f, 12.5997f, 1.5657f, 12.6155f)
                curveTo(1.6038f, 12.6473f, 1.6577f, 12.6911f, 1.7274f, 12.745f)
                curveTo(1.8669f, 12.8528f, 2.0699f, 13.001f, 2.3365f, 13.1739f)
                curveTo(2.8696f, 13.5196f, 3.6574f, 13.9644f, 4.7002f, 14.3814f)
                lineTo(7.5086f, 15.5048f)
                lineTo(7.6243f, 15.5511f)
                curveTo(9.5011f, 16.302f, 10.6206f, 16.75f, 11.9999f, 16.75f)
                curveTo(13.3791f, 16.75f, 14.4987f, 16.302f, 16.3754f, 15.5511f)
                lineTo(16.4911f, 15.5048f)
                lineTo(19.2996f, 14.3814f)
                curveTo(20.3423f, 13.9644f, 21.1302f, 13.5196f, 21.6632f, 13.1739f)
                curveTo(21.9298f, 13.001f, 22.1328f, 12.8528f, 22.2723f, 12.745f)
                curveTo(22.3421f, 12.6911f, 22.3959f, 12.6473f, 22.434f, 12.6155f)
                curveTo(22.453f, 12.5997f, 22.4681f, 12.5868f, 22.4792f, 12.5772f)
                lineTo(22.4929f, 12.5652f)
                lineTo(22.4975f, 12.5611f)
                lineTo(22.4993f, 12.5595f)
                lineTo(22.5007f, 12.5583f)
                curveTo(22.809f, 12.2817f, 22.8347f, 11.8075f, 22.5582f, 11.4992f)
                curveTo(22.2821f, 11.1915f, 21.8093f, 11.1652f, 21.501f, 11.44f)
                lineTo(21.4993f, 11.4415f)
                lineTo(21.4973f, 11.4432f)
                curveTo(21.4929f, 11.4471f, 21.4846f, 11.4541f, 21.4726f, 11.4641f)
                curveTo(21.4486f, 11.4842f, 21.4094f, 11.5161f, 21.3551f, 11.5581f)
                curveTo(21.2463f, 11.6422f, 21.077f, 11.7663f, 20.8471f, 11.9154f)
                curveTo(20.3872f, 12.2136f, 19.6857f, 12.6115f, 18.7425f, 12.9887f)
                lineTo(15.934f, 14.1121f)
                curveTo(13.9092f, 14.922f, 13.0603f, 15.25f, 11.9999f, 15.25f)
                curveTo(10.9395f, 15.25f, 10.0905f, 14.922f, 8.0657f, 14.1121f)
                lineTo(5.2572f, 12.9887f)
                curveTo(4.3141f, 12.6115f, 3.6125f, 12.2136f, 3.1527f, 11.9154f)
                curveTo(2.9228f, 11.7663f, 2.7534f, 11.6422f, 2.6446f, 11.5581f)
                curveTo(2.5903f, 11.5161f, 2.5511f, 11.4842f, 2.5271f, 11.4641f)
                curveTo(2.5151f, 11.4541f, 2.5069f, 11.4471f, 2.5025f, 11.4432f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.4988f, 15.4991f)
                curveTo(2.1904f, 15.2243f, 1.7176f, 15.2506f, 1.4416f, 15.5583f)
                curveTo(1.165f, 15.8666f, 1.191f, 16.3411f, 1.4994f, 16.6177f)
                lineTo(1.5004f, 16.6186f)
                lineTo(1.5022f, 16.6202f)
                lineTo(1.5068f, 16.6243f)
                lineTo(1.5205f, 16.6362f)
                curveTo(1.5316f, 16.6459f, 1.5467f, 16.6587f, 1.5657f, 16.6746f)
                curveTo(1.6038f, 16.7064f, 1.6577f, 16.7502f, 1.7274f, 16.8041f)
                curveTo(1.8669f, 16.9119f, 2.0699f, 17.0601f, 2.3365f, 17.233f)
                curveTo(2.8696f, 17.5787f, 3.6574f, 18.0234f, 4.7002f, 18.4405f)
                lineTo(7.5086f, 19.5639f)
                lineTo(7.6243f, 19.6102f)
                curveTo(9.5011f, 20.3611f, 10.6206f, 20.8091f, 11.9999f, 20.8091f)
                curveTo(13.3791f, 20.8091f, 14.4987f, 20.3611f, 16.3754f, 19.6102f)
                lineTo(16.4911f, 19.5639f)
                lineTo(19.2996f, 18.4405f)
                curveTo(20.3423f, 18.0234f, 21.1302f, 17.5787f, 21.6632f, 17.233f)
                curveTo(21.9298f, 17.0601f, 22.1328f, 16.9119f, 22.2723f, 16.8041f)
                curveTo(22.3421f, 16.7502f, 22.3959f, 16.7064f, 22.434f, 16.6746f)
                curveTo(22.453f, 16.6587f, 22.4681f, 16.6459f, 22.4792f, 16.6362f)
                lineTo(22.4929f, 16.6243f)
                lineTo(22.4975f, 16.6202f)
                lineTo(22.4993f, 16.6186f)
                lineTo(22.5007f, 16.6174f)
                curveTo(22.809f, 16.3408f, 22.8347f, 15.8666f, 22.5582f, 15.5583f)
                curveTo(22.2821f, 15.2506f, 21.8093f, 15.2243f, 21.501f, 15.4991f)
                lineTo(21.4993f, 15.5005f)
                lineTo(21.4973f, 15.5023f)
                curveTo(21.4929f, 15.5061f, 21.4846f, 15.5132f, 21.4726f, 15.5232f)
                curveTo(21.4486f, 15.5432f, 21.4094f, 15.5752f, 21.3551f, 15.6172f)
                curveTo(21.2463f, 15.7013f, 21.077f, 15.8254f, 20.8471f, 15.9745f)
                curveTo(20.3872f, 16.2727f, 19.6857f, 16.6705f, 18.7425f, 17.0478f)
                lineTo(15.934f, 18.1712f)
                curveTo(13.9092f, 18.9811f, 13.0603f, 19.3091f, 11.9999f, 19.3091f)
                curveTo(10.9395f, 19.3091f, 10.0905f, 18.9811f, 8.0657f, 18.1712f)
                lineTo(5.2572f, 17.0478f)
                curveTo(4.3141f, 16.6705f, 3.6125f, 16.2727f, 3.1527f, 15.9745f)
                curveTo(2.9228f, 15.8254f, 2.7534f, 15.7013f, 2.6446f, 15.6172f)
                curveTo(2.5903f, 15.5752f, 2.5511f, 15.5432f, 2.5271f, 15.5232f)
                curveTo(2.5151f, 15.5132f, 2.5069f, 15.5061f, 2.5025f, 15.5023f)
                lineTo(2.4988f, 15.4991f)
                close()
            }
        }
        .build()
        return _layersMinimalistic!!
    }

private var _layersMinimalistic: ImageVector? = null
