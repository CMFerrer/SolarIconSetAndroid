package com.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.AstronomyGroup

val AstronomyGroup.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(
            name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.629f, 2.9238f)
                lineTo(1.6358f, 9.0313f)
                curveTo(1.2737f, 9.2324f, 1.1432f, 9.689f, 1.3444f, 10.0511f)
                curveTo(1.5456f, 10.4132f, 2.0022f, 10.5436f, 2.3642f, 10.3425f)
                lineTo(11.0497f, 5.5171f)
                curveTo(10.5131f, 7.3233f, 10.8479f, 9.3332f, 12.0544f, 10.8851f)
                lineTo(4.4697f, 18.4697f)
                curveTo(4.1768f, 18.7626f, 4.1768f, 19.2374f, 4.4697f, 19.5303f)
                curveTo(4.7626f, 19.8232f, 5.2375f, 19.8232f, 5.5303f, 19.5303f)
                lineTo(13.115f, 11.9457f)
                curveTo(14.6669f, 13.152f, 16.6768f, 13.4868f, 18.483f, 12.9502f)
                lineTo(13.6576f, 21.6358f)
                curveTo(13.4565f, 21.9979f, 13.5869f, 22.4545f, 13.949f, 22.6556f)
                curveTo(14.3111f, 22.8568f, 14.7677f, 22.7263f, 14.9689f, 22.3642f)
                lineTo(21.0762f, 11.3709f)
                curveTo(23.333f, 9.0324f, 23.3077f, 5.3071f, 21.0003f, 2.9997f)
                curveTo(18.6928f, 0.6924f, 14.9675f, 0.667f, 12.629f, 2.9238f)
                close()
                moveTo(20.2731f, 10.0152f)
                curveTo(21.6787f, 8.2586f, 21.5675f, 5.6883f, 19.9396f, 4.0604f)
                curveTo(18.3117f, 2.4325f, 15.7414f, 2.3214f, 13.9848f, 3.7269f)
                curveTo(14.0695f, 3.8987f, 14.1858f, 4.1173f, 14.3408f, 4.3757f)
                curveTo(14.7719f, 5.0943f, 15.5039f, 6.123f, 16.6906f, 7.3096f)
                curveTo(17.8772f, 8.4962f, 18.9058f, 9.2282f, 19.6244f, 9.6593f)
                curveTo(19.8827f, 9.8142f, 20.1013f, 9.9305f, 20.2731f, 10.0152f)
                close()
                moveTo(19.0645f, 11.0697f)
                curveTo(18.9964f, 11.0307f, 18.9258f, 10.9894f, 18.8527f, 10.9456f)
                curveTo(18.15f, 10.524f, 17.2229f, 9.8714f, 16.1696f, 8.8912f)
                lineTo(14.187f, 10.8738f)
                curveTo(15.6344f, 11.9031f, 17.5568f, 11.9684f, 19.0645f, 11.0697f)
                close()
                moveTo(13.1263f, 9.8131f)
                curveTo(12.0969f, 8.3657f, 12.0315f, 6.4432f, 12.9303f, 4.9354f)
                curveTo(12.9693f, 5.0036f, 13.0106f, 5.0742f, 13.0545f, 5.1473f)
                curveTo(13.4761f, 5.8502f, 14.1287f, 6.7772f, 15.109f, 7.8305f)
                lineTo(13.1263f, 9.8131f)
                close()
            }
        }
            .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
