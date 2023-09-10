package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.TShirt: ImageVector
    get() {
        if (_tShirt != null) {
            return _tShirt!!
        }
        _tShirt = Builder(
            name = "TShirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.7767f, 10.2955f)
                verticalLineTo(18.265f)
                curveTo(5.7767f, 19.5881f, 5.7767f, 20.2497f, 6.2256f, 20.8116f)
                curveTo(6.6744f, 21.3736f, 7.2109f, 21.4723f, 8.2839f, 21.6696f)
                curveTo(9.2758f, 21.8521f, 10.5325f, 22.0f, 12.0f, 22.0f)
                curveTo(13.4675f, 22.0f, 14.7242f, 21.8521f, 15.7161f, 21.6696f)
                curveTo(16.7891f, 21.4723f, 17.3256f, 21.3736f, 17.7745f, 20.8116f)
                curveTo(18.2233f, 20.2497f, 18.2233f, 19.5881f, 18.2233f, 18.265f)
                verticalLineTo(10.2955f)
                curveTo(18.2233f, 9.6117f, 18.2233f, 9.2698f, 18.3547f, 8.9693f)
                curveTo(18.4861f, 8.6687f, 18.7329f, 8.4462f, 19.2264f, 8.0012f)
                lineTo(19.4116f, 7.8342f)
                curveTo(20.4679f, 6.8817f, 20.996f, 6.4055f, 21.0f, 5.7161f)
                curveTo(21.004f, 5.0268f, 20.5355f, 4.5939f, 19.5987f, 3.7282f)
                curveTo(19.4569f, 3.5971f, 19.3164f, 3.4746f, 19.1808f, 3.3658f)
                curveTo(18.7094f, 2.988f, 18.0431f, 2.5744f, 17.5332f, 2.2757f)
                curveTo(17.056f, 1.9961f, 16.4954f, 1.9317f, 15.9656f, 2.071f)
                lineTo(15.4755f, 2.1999f)
                curveTo(15.0874f, 2.302f, 14.7493f, 2.5526f, 14.5274f, 2.9028f)
                curveTo(13.3251f, 4.8001f, 10.6749f, 4.8001f, 9.4726f, 2.9028f)
                curveTo(9.2507f, 2.5526f, 8.9126f, 2.302f, 8.5245f, 2.1999f)
                lineTo(8.0344f, 2.071f)
                curveTo(7.5046f, 1.9317f, 6.944f, 1.9961f, 6.4668f, 2.2757f)
                curveTo(5.9569f, 2.5744f, 5.2906f, 2.988f, 4.8192f, 3.3658f)
                curveTo(4.6836f, 3.4746f, 4.5431f, 3.5971f, 4.4013f, 3.7282f)
                curveTo(3.4645f, 4.5939f, 2.996f, 5.0268f, 3.0f, 5.7161f)
                curveTo(3.004f, 6.4055f, 3.5321f, 6.8817f, 4.5883f, 7.8342f)
                lineTo(4.7736f, 8.0012f)
                curveTo(5.2671f, 8.4462f, 5.5139f, 8.6687f, 5.6453f, 8.9693f)
                curveTo(5.7767f, 9.2698f, 5.7767f, 9.6117f, 5.7767f, 10.2955f)
                close()
            }
        }
            .build()
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
