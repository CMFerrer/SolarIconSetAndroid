package com.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.HomeFurnitureGroup

public val HomeFurnitureGroup.Bath: ImageVector
    get() {
        if (_bath != null) {
            return _bath!!
        }
        _bath = Builder(name = "Bath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.3852f, 2.75f)
                curveTo(4.4821f, 2.75f, 3.75f, 3.4821f, 3.75f, 4.3852f)
                verticalLineTo(11.25f)
                horizontalLineTo(4.0343f)
                curveTo(4.0452f, 11.25f, 4.056f, 11.25f, 4.0668f, 11.25f)
                curveTo(4.0721f, 11.25f, 4.0774f, 11.25f, 4.0827f, 11.25f)
                lineTo(19.9332f, 11.25f)
                curveTo(19.944f, 11.25f, 19.9548f, 11.25f, 19.9657f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(21.7321f)
                curveTo(21.7386f, 12.7949f, 21.7433f, 12.8405f, 21.7463f, 12.8864f)
                curveTo(21.7501f, 12.9442f, 21.75f, 13.0066f, 21.75f, 13.0668f)
                lineTo(21.75f, 13.1047f)
                curveTo(21.75f, 13.4799f, 21.75f, 13.6998f, 21.7344f, 13.9452f)
                curveTo(21.5925f, 16.1815f, 20.384f, 18.2467f, 18.6326f, 19.597f)
                curveTo(18.6463f, 19.6186f, 18.6591f, 19.6412f, 18.6708f, 19.6646f)
                lineTo(19.6708f, 21.6646f)
                curveTo(19.8561f, 22.0351f, 19.7059f, 22.4856f, 19.3354f, 22.6708f)
                curveTo(18.9649f, 22.8561f, 18.5144f, 22.7059f, 18.3292f, 22.3354f)
                lineTo(17.3615f, 20.4f)
                curveTo(16.5597f, 20.8059f, 15.6878f, 21.073f, 14.7809f, 21.1648f)
                curveTo(14.5364f, 21.1896f, 14.3872f, 21.1952f, 14.133f, 21.2047f)
                lineTo(14.1263f, 21.205f)
                curveTo(13.3861f, 21.2328f, 12.6615f, 21.25f, 12.0f, 21.25f)
                curveTo(11.3385f, 21.25f, 10.6139f, 21.2328f, 9.8737f, 21.205f)
                lineTo(9.867f, 21.2047f)
                curveTo(9.6128f, 21.1952f, 9.4636f, 21.1896f, 9.2191f, 21.1648f)
                curveTo(8.3122f, 21.073f, 7.4403f, 20.8059f, 6.6385f, 20.4f)
                lineTo(5.6708f, 22.3354f)
                curveTo(5.4856f, 22.7059f, 5.0351f, 22.8561f, 4.6646f, 22.6708f)
                curveTo(4.2941f, 22.4856f, 4.1439f, 22.0351f, 4.3292f, 21.6646f)
                lineTo(5.3292f, 19.6646f)
                curveTo(5.3409f, 19.6412f, 5.3537f, 19.6186f, 5.3674f, 19.597f)
                curveTo(3.616f, 18.2467f, 2.4075f, 16.1815f, 2.2656f, 13.9452f)
                curveTo(2.25f, 13.6998f, 2.25f, 13.4798f, 2.25f, 13.1046f)
                lineTo(2.25f, 13.0827f)
                curveTo(2.25f, 13.0774f, 2.25f, 13.0721f, 2.25f, 13.0668f)
                curveTo(2.25f, 13.0483f, 2.25f, 13.0296f, 2.2501f, 13.0108f)
                curveTo(2.25f, 13.0072f, 2.25f, 13.0036f, 2.25f, 13.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(2.25f)
                verticalLineTo(4.3852f)
                curveTo(2.25f, 2.6537f, 3.6537f, 1.25f, 5.3852f, 1.25f)
                curveTo(6.6672f, 1.25f, 7.82f, 2.0305f, 8.2961f, 3.2208f)
                lineTo(8.4062f, 3.4961f)
                curveTo(9.1995f, 3.2949f, 10.0603f, 3.3415f, 10.8717f, 3.6881f)
                curveTo(11.887f, 4.1219f, 12.6258f, 4.9403f, 13.0041f, 5.9005f)
                curveTo(13.1526f, 6.2774f, 12.975f, 6.7042f, 12.6029f, 6.8644f)
                lineTo(6.6421f, 9.4304f)
                curveTo(6.4557f, 9.5107f, 6.2447f, 9.512f, 6.0574f, 9.434f)
                curveTo(5.87f, 9.356f, 5.7222f, 9.2053f, 5.6478f, 9.0165f)
                curveTo(5.2696f, 8.0567f, 5.2469f, 6.9451f, 5.6672f, 5.9101f)
                curveTo(5.9664f, 5.1733f, 6.4521f, 4.5693f, 7.0466f, 4.1361f)
                lineTo(6.9034f, 3.7779f)
                curveTo(6.6551f, 3.1571f, 6.0538f, 2.75f, 5.3852f, 2.75f)
                close()
                moveTo(4.0827f, 12.75f)
                curveTo(4.0426f, 12.75f, 4.0188f, 12.75f, 4.0008f, 12.7502f)
                curveTo(3.9876f, 12.7504f, 3.983f, 12.7506f, 3.9828f, 12.7506f)
                curveTo(3.9828f, 12.7506f, 3.9822f, 12.7506f, 3.9828f, 12.7506f)
                curveTo(3.8577f, 12.7587f, 3.759f, 12.8581f, 3.7506f, 12.9831f)
                curveTo(3.7505f, 12.9843f, 3.7503f, 12.9893f, 3.7502f, 13.0008f)
                curveTo(3.75f, 13.0188f, 3.75f, 13.0426f, 3.75f, 13.0827f)
                curveTo(3.75f, 13.4853f, 3.7503f, 13.6573f, 3.7626f, 13.8501f)
                curveTo(3.948f, 16.7718f, 6.4576f, 19.3775f, 9.3702f, 19.6725f)
                curveTo(9.5652f, 19.6922f, 9.6731f, 19.6964f, 9.93f, 19.7061f)
                curveTo(10.658f, 19.7334f, 11.3629f, 19.75f, 12.0f, 19.75f)
                curveTo(12.6371f, 19.75f, 13.342f, 19.7334f, 14.07f, 19.7061f)
                curveTo(14.3269f, 19.6964f, 14.4348f, 19.6922f, 14.6298f, 19.6725f)
                curveTo(17.5424f, 19.3775f, 20.052f, 16.7718f, 20.2375f, 13.8501f)
                curveTo(20.2497f, 13.6573f, 20.25f, 13.4853f, 20.25f, 13.0827f)
                curveTo(20.25f, 13.0426f, 20.25f, 13.0188f, 20.2498f, 13.0008f)
                curveTo(20.2497f, 12.9906f, 20.2495f, 12.9855f, 20.2495f, 12.9837f)
                curveTo(20.2494f, 12.9824f, 20.2494f, 12.9825f, 20.2495f, 12.9837f)
                curveTo(20.2413f, 12.8584f, 20.1415f, 12.7587f, 20.0162f, 12.7505f)
                curveTo(20.0174f, 12.7506f, 20.0177f, 12.7506f, 20.0162f, 12.7505f)
                curveTo(20.0142f, 12.7505f, 20.009f, 12.7503f, 19.9992f, 12.7502f)
                curveTo(19.9812f, 12.75f, 19.9574f, 12.75f, 19.9173f, 12.75f)
                horizontalLineTo(4.0827f)
                close()
                moveTo(10.2824f, 5.0675f)
                curveTo(9.6251f, 4.7867f, 8.9145f, 4.8258f, 8.3071f, 5.1215f)
                curveTo(7.7683f, 5.3838f, 7.3112f, 5.8486f, 7.057f, 6.4745f)
                curveTo(6.8935f, 6.8772f, 6.8344f, 7.2966f, 6.8665f, 7.7008f)
                lineTo(11.2476f, 5.8147f)
                curveTo(10.9982f, 5.4934f, 10.6713f, 5.2337f, 10.2824f, 5.0675f)
                close()
            }
        }
        .build()
        return _bath!!
    }

private var _bath: ImageVector? = null
