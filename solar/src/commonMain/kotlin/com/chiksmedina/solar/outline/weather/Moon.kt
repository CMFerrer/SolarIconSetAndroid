package com.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.WeatherGroup

val WeatherGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(
            name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.0174f, 2.8016f)
                curveTo(6.3707f, 3.2922f, 2.75f, 7.2233f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(16.7767f, 21.25f, 20.7078f, 17.6293f, 21.1984f, 12.9826f)
                curveTo(19.8717f, 14.6669f, 17.8126f, 15.75f, 15.5f, 15.75f)
                curveTo(11.4959f, 15.75f, 8.25f, 12.5041f, 8.25f, 8.5f)
                curveTo(8.25f, 6.1874f, 9.3331f, 4.1283f, 11.0174f, 2.8016f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(12.7166f, 1.25f, 13.0754f, 1.8213f, 13.1368f, 2.2763f)
                curveTo(13.196f, 2.714f, 13.0342f, 3.2706f, 12.531f, 3.5747f)
                curveTo(10.8627f, 4.5828f, 9.75f, 6.4118f, 9.75f, 8.5f)
                curveTo(9.75f, 11.6756f, 12.3244f, 14.25f, 15.5f, 14.25f)
                curveTo(17.5882f, 14.25f, 19.4172f, 13.1373f, 20.4253f, 11.469f)
                curveTo(20.7293f, 10.9658f, 21.286f, 10.804f, 21.7237f, 10.8632f)
                curveTo(22.1787f, 10.9246f, 22.75f, 11.2834f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
            }
        }
            .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
