package com.chiksmedina.solar.bold.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.DesignToolsGroup

val DesignToolsGroup.LayersMinimalistic: ImageVector
    get() {
        if (_layersMinimalistic != null) {
            return _layersMinimalistic!!
        }
        _layersMinimalistic = Builder(
            name = "LayersMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.5005f, 11.4415f)
                curveTo(2.5005f, 11.4415f, 2.5005f, 11.4415f, 2.5005f, 11.4415f)
                lineTo(2.4991f, 11.4402f)
                lineTo(2.5026f, 11.4432f)
                curveTo(2.507f, 11.4471f, 2.5152f, 11.4541f, 2.5272f, 11.4641f)
                curveTo(2.5512f, 11.4842f, 2.5904f, 11.5161f, 2.6448f, 11.5581f)
                curveTo(2.7535f, 11.6422f, 2.9229f, 11.7663f, 3.1528f, 11.9154f)
                curveTo(3.6126f, 12.2136f, 4.3142f, 12.6114f, 5.2574f, 12.9887f)
                lineTo(8.0658f, 14.1121f)
                curveTo(10.0907f, 14.922f, 10.9396f, 15.25f, 12.0f, 15.25f)
                curveTo(13.0604f, 15.25f, 13.9093f, 14.922f, 15.9342f, 14.1121f)
                lineTo(18.7426f, 12.9887f)
                curveTo(19.6858f, 12.6114f, 20.3874f, 12.2136f, 20.8472f, 11.9154f)
                curveTo(21.0771f, 11.7663f, 21.2465f, 11.6422f, 21.3552f, 11.5581f)
                curveTo(21.4096f, 11.5161f, 21.4488f, 11.4842f, 21.4728f, 11.4641f)
                curveTo(21.4848f, 11.4541f, 21.493f, 11.4471f, 21.4974f, 11.4432f)
                lineTo(21.4995f, 11.4415f)
                curveTo(21.5f, 11.441f, 21.5006f, 11.4405f, 21.5011f, 11.44f)
                curveTo(21.8095f, 11.1652f, 22.2823f, 11.1915f, 22.5583f, 11.4992f)
                curveTo(22.8349f, 11.8075f, 22.8092f, 12.2817f, 22.5008f, 12.5583f)
                lineTo(22.0f, 12.0f)
                curveTo(22.5008f, 12.5583f, 22.501f, 12.5581f, 22.5008f, 12.5583f)
                lineTo(22.4994f, 12.5595f)
                lineTo(22.4977f, 12.5611f)
                lineTo(22.493f, 12.5652f)
                lineTo(22.4793f, 12.5772f)
                curveTo(22.4682f, 12.5868f, 22.4532f, 12.5997f, 22.4341f, 12.6155f)
                curveTo(22.3961f, 12.6473f, 22.3422f, 12.6911f, 22.2724f, 12.745f)
                curveTo(22.1329f, 12.8528f, 21.9299f, 13.001f, 21.6634f, 13.1739f)
                curveTo(21.1303f, 13.5196f, 20.3424f, 13.9644f, 19.2997f, 14.3814f)
                lineTo(16.4912f, 15.5048f)
                curveTo(16.4524f, 15.5204f, 16.4138f, 15.5358f, 16.3756f, 15.5511f)
                curveTo(14.4988f, 16.302f, 13.3792f, 16.75f, 12.0f, 16.75f)
                curveTo(10.6208f, 16.75f, 9.5012f, 16.302f, 7.6244f, 15.5511f)
                curveTo(7.5862f, 15.5358f, 7.5476f, 15.5204f, 7.5087f, 15.5048f)
                lineTo(4.7003f, 14.3814f)
                curveTo(3.6576f, 13.9644f, 2.8697f, 13.5196f, 2.3366f, 13.1739f)
                curveTo(2.0701f, 13.001f, 1.8671f, 12.8528f, 1.7276f, 12.745f)
                curveTo(1.6578f, 12.6911f, 1.6039f, 12.6473f, 1.5659f, 12.6155f)
                curveTo(1.5468f, 12.5997f, 1.5318f, 12.5868f, 1.5207f, 12.5772f)
                lineTo(1.507f, 12.5652f)
                lineTo(1.5023f, 12.5611f)
                lineTo(1.5006f, 12.5595f)
                lineTo(1.4995f, 12.5586f)
                curveTo(1.4993f, 12.5584f, 1.4992f, 12.5583f, 2.0f, 12.0f)
                lineTo(1.4995f, 12.5586f)
                curveTo(1.1912f, 12.282f, 1.1651f, 11.8075f, 1.4417f, 11.4992f)
                curveTo(1.7177f, 11.1915f, 2.1907f, 11.1654f, 2.4991f, 11.4402f)
                moveTo(2.5005f, 11.4415f)
                curveTo(2.5005f, 11.4415f, 2.5005f, 11.4415f, 2.5005f, 11.4415f)
                close()
                moveTo(2.499f, 15.4401f)
                curveTo(2.1906f, 15.1652f, 1.7177f, 15.1915f, 1.4417f, 15.4992f)
                lineTo(2.499f, 15.4401f)
                close()
                moveTo(2.499f, 15.4401f)
                lineTo(2.5026f, 15.4432f)
                curveTo(2.507f, 15.4471f, 2.5152f, 15.4541f, 2.5272f, 15.4641f)
                curveTo(2.5512f, 15.4842f, 2.5904f, 15.5161f, 2.6448f, 15.5581f)
                curveTo(2.7535f, 15.6422f, 2.9229f, 15.7663f, 3.1528f, 15.9154f)
                curveTo(3.6126f, 16.2136f, 4.3142f, 16.6114f, 5.2574f, 16.9887f)
                lineTo(8.0658f, 18.1121f)
                curveTo(10.0907f, 18.922f, 10.9396f, 19.25f, 12.0f, 19.25f)
                curveTo(13.0604f, 19.25f, 13.9093f, 18.922f, 15.9342f, 18.1121f)
                lineTo(18.7426f, 16.9887f)
                curveTo(19.6858f, 16.6114f, 20.3874f, 16.2136f, 20.8472f, 15.9154f)
                curveTo(21.0771f, 15.7663f, 21.2465f, 15.6422f, 21.3552f, 15.5581f)
                curveTo(21.4096f, 15.5161f, 21.4488f, 15.4842f, 21.4728f, 15.4641f)
                curveTo(21.4848f, 15.4541f, 21.493f, 15.4471f, 21.4974f, 15.4432f)
                lineTo(21.4995f, 15.4415f)
                curveTo(21.5f, 15.441f, 21.5006f, 15.4405f, 21.5011f, 15.44f)
                curveTo(21.8095f, 15.1652f, 22.2823f, 15.1915f, 22.5583f, 15.4992f)
                curveTo(22.8349f, 15.8075f, 22.8092f, 16.2817f, 22.5008f, 16.5583f)
                lineTo(22.0166f, 16.0185f)
                curveTo(22.5008f, 16.5583f, 22.501f, 16.5581f, 22.5008f, 16.5583f)
                lineTo(22.4994f, 16.5595f)
                lineTo(22.4977f, 16.5611f)
                lineTo(22.493f, 16.5652f)
                lineTo(22.4793f, 16.5772f)
                curveTo(22.4682f, 16.5868f, 22.4532f, 16.5997f, 22.4341f, 16.6155f)
                curveTo(22.3961f, 16.6473f, 22.3422f, 16.6911f, 22.2724f, 16.745f)
                curveTo(22.1329f, 16.8528f, 21.9299f, 17.001f, 21.6634f, 17.1739f)
                curveTo(21.1303f, 17.5196f, 20.3424f, 17.9644f, 19.2997f, 18.3814f)
                lineTo(16.4912f, 19.5048f)
                curveTo(16.4524f, 19.5204f, 16.4138f, 19.5358f, 16.3756f, 19.5511f)
                curveTo(14.4988f, 20.302f, 13.3792f, 20.75f, 12.0f, 20.75f)
                curveTo(10.6208f, 20.75f, 9.5012f, 20.302f, 7.6244f, 19.5511f)
                curveTo(7.5862f, 19.5358f, 7.5476f, 19.5204f, 7.5087f, 19.5048f)
                lineTo(4.7003f, 18.3814f)
                curveTo(3.6576f, 17.9644f, 2.8697f, 17.5196f, 2.3366f, 17.1739f)
                curveTo(2.0701f, 17.001f, 1.8671f, 16.8528f, 1.7276f, 16.745f)
                curveTo(1.6578f, 16.6911f, 1.6039f, 16.6473f, 1.5659f, 16.6155f)
                curveTo(1.5468f, 16.5997f, 1.5318f, 16.5868f, 1.5207f, 16.5772f)
                lineTo(1.507f, 16.5652f)
                lineTo(1.5023f, 16.5611f)
                lineTo(1.5006f, 16.5595f)
                lineTo(1.4995f, 16.5586f)
                curveTo(1.4993f, 16.5584f, 1.4992f, 16.5583f, 2.0f, 16.0f)
                lineTo(1.4995f, 16.5586f)
                curveTo(1.1912f, 16.282f, 1.1651f, 15.8075f, 1.4417f, 15.4992f)
            }
        }
            .build()
        return _layersMinimalistic!!
    }

private var _layersMinimalistic: ImageVector? = null
