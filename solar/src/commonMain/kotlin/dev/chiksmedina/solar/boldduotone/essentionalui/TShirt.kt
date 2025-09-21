package dev.chiksmedina.solar.boldduotone.essentionalui

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
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.7767f, 18.265f)
                verticalLineTo(10.2955f)
                curveTo(5.7767f, 9.6117f, 5.7767f, 9.2698f, 5.6453f, 8.9693f)
                curveTo(5.5139f, 8.6687f, 5.2671f, 8.4462f, 4.7736f, 8.0012f)
                lineTo(4.5883f, 7.8342f)
                curveTo(3.5321f, 6.8817f, 3.004f, 6.4055f, 3.0f, 5.7161f)
                curveTo(2.996f, 5.0268f, 3.4645f, 4.5939f, 4.4013f, 3.7282f)
                curveTo(4.5431f, 3.5971f, 4.6836f, 3.4746f, 4.8192f, 3.3658f)
                curveTo(5.2906f, 2.988f, 5.9569f, 2.5744f, 6.4668f, 2.2757f)
                curveTo(6.944f, 1.9961f, 7.5046f, 1.9317f, 8.0344f, 2.071f)
                lineTo(8.5245f, 2.1999f)
                curveTo(8.9126f, 2.302f, 9.2507f, 2.5526f, 9.4726f, 2.9028f)
                curveTo(10.0737f, 3.8515f, 11.0369f, 4.3258f, 12.0f, 4.3258f)
                verticalLineTo(22.0f)
                curveTo(10.5325f, 22.0f, 9.2758f, 21.8521f, 8.2839f, 21.6696f)
                curveTo(7.2109f, 21.4723f, 6.6744f, 21.3736f, 6.2256f, 20.8116f)
                curveTo(5.7767f, 20.2497f, 5.7767f, 19.5881f, 5.7767f, 18.265f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.2233f, 18.265f)
                verticalLineTo(10.2955f)
                curveTo(18.2233f, 9.6117f, 18.2233f, 9.2698f, 18.3547f, 8.9693f)
                curveTo(18.4861f, 8.6687f, 18.7329f, 8.4462f, 19.2264f, 8.0012f)
                lineTo(19.4116f, 7.8342f)
                curveTo(20.4679f, 6.8817f, 20.996f, 6.4055f, 21.0f, 5.7161f)
                curveTo(21.0039f, 5.0268f, 20.5355f, 4.5939f, 19.5987f, 3.7282f)
                curveTo(19.4569f, 3.5971f, 19.3164f, 3.4746f, 19.1808f, 3.3658f)
                curveTo(18.7094f, 2.988f, 18.0431f, 2.5744f, 17.5332f, 2.2757f)
                curveTo(17.056f, 1.9961f, 16.4954f, 1.9317f, 15.9656f, 2.071f)
                lineTo(15.4755f, 2.1999f)
                curveTo(15.0874f, 2.302f, 14.7493f, 2.5526f, 14.5274f, 2.9028f)
                curveTo(13.9263f, 3.8515f, 12.9631f, 4.3258f, 12.0f, 4.3258f)
                verticalLineTo(22.0f)
                curveTo(13.4675f, 22.0f, 14.7242f, 21.8521f, 15.7161f, 21.6696f)
                curveTo(16.7891f, 21.4723f, 17.3256f, 21.3736f, 17.7745f, 20.8116f)
                curveTo(18.2233f, 20.2497f, 18.2233f, 19.5881f, 18.2233f, 18.265f)
                close()
            }
        }
            .build()
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
