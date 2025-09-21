package dev.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(
            name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 3.25f)
                curveTo(12.4142f, 3.25f, 12.75f, 3.5858f, 12.75f, 4.0f)
                verticalLineTo(6.4f)
                curveTo(12.75f, 6.8142f, 12.4142f, 7.15f, 12.0f, 7.15f)
                curveTo(11.5858f, 7.15f, 11.25f, 6.8142f, 11.25f, 6.4f)
                verticalLineTo(4.0f)
                curveTo(11.25f, 3.5858f, 11.5858f, 3.25f, 12.0f, 3.25f)
                close()
                moveTo(18.1872f, 5.8128f)
                curveTo(18.4801f, 6.1057f, 18.4801f, 6.5806f, 18.1872f, 6.8735f)
                lineTo(16.4901f, 8.5705f)
                curveTo(16.1972f, 8.8634f, 15.7224f, 8.8634f, 15.4295f, 8.5705f)
                curveTo(15.1366f, 8.2776f, 15.1366f, 7.8028f, 15.4295f, 7.5099f)
                lineTo(17.1265f, 5.8128f)
                curveTo(17.4194f, 5.5199f, 17.8943f, 5.5199f, 18.1872f, 5.8128f)
                close()
                moveTo(5.8126f, 5.813f)
                curveTo(6.1055f, 5.5201f, 6.5804f, 5.5201f, 6.8733f, 5.813f)
                lineTo(8.5703f, 7.51f)
                curveTo(8.8632f, 7.8029f, 8.8632f, 8.2778f, 8.5703f, 8.5707f)
                curveTo(8.2774f, 8.8636f, 7.8025f, 8.8636f, 7.5097f, 8.5707f)
                lineTo(5.8126f, 6.8737f)
                curveTo(5.5197f, 6.5808f, 5.5197f, 6.1059f, 5.8126f, 5.813f)
                close()
                moveTo(3.25f, 12.0f)
                curveTo(3.25f, 11.5858f, 3.5858f, 11.25f, 4.0f, 11.25f)
                horizontalLineTo(6.4f)
                curveTo(6.8142f, 11.25f, 7.15f, 11.5858f, 7.15f, 12.0f)
                curveTo(7.15f, 12.4142f, 6.8142f, 12.75f, 6.4f, 12.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 12.75f, 3.25f, 12.4142f, 3.25f, 12.0f)
                close()
                moveTo(16.85f, 12.0f)
                curveTo(16.85f, 11.5858f, 17.1858f, 11.25f, 17.6f, 11.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 11.25f, 20.75f, 11.5858f, 20.75f, 12.0f)
                curveTo(20.75f, 12.4142f, 20.4142f, 12.75f, 20.0f, 12.75f)
                horizontalLineTo(17.6f)
                curveTo(17.1858f, 12.75f, 16.85f, 12.4142f, 16.85f, 12.0f)
                close()
                moveTo(8.5705f, 15.4295f)
                curveTo(8.8634f, 15.7224f, 8.8634f, 16.1972f, 8.5705f, 16.4901f)
                lineTo(6.8735f, 18.1872f)
                curveTo(6.5806f, 18.4801f, 6.1057f, 18.4801f, 5.8128f, 18.1872f)
                curveTo(5.5199f, 17.8943f, 5.5199f, 17.4194f, 5.8128f, 17.1265f)
                lineTo(7.5099f, 15.4295f)
                curveTo(7.8028f, 15.1366f, 8.2776f, 15.1366f, 8.5705f, 15.4295f)
                close()
                moveTo(15.4293f, 15.4296f)
                curveTo(15.7221f, 15.1368f, 16.197f, 15.1368f, 16.4899f, 15.4296f)
                lineTo(18.187f, 17.1267f)
                curveTo(18.4799f, 17.4196f, 18.4799f, 17.8945f, 18.187f, 18.1874f)
                curveTo(17.8941f, 18.4803f, 17.4192f, 18.4803f, 17.1263f, 18.1874f)
                lineTo(15.4293f, 16.4903f)
                curveTo(15.1364f, 16.1974f, 15.1364f, 15.7225f, 15.4293f, 15.4296f)
                close()
                moveTo(12.0f, 16.85f)
                curveTo(12.4142f, 16.85f, 12.75f, 17.1858f, 12.75f, 17.6f)
                verticalLineTo(20.0f)
                curveTo(12.75f, 20.4142f, 12.4142f, 20.75f, 12.0f, 20.75f)
                curveTo(11.5858f, 20.75f, 11.25f, 20.4142f, 11.25f, 20.0f)
                verticalLineTo(17.6f)
                curveTo(11.25f, 17.1858f, 11.5858f, 16.85f, 12.0f, 16.85f)
                close()
            }
        }
            .build()
        return _star!!
    }

private var _star: ImageVector? = null
