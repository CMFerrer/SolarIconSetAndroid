package dev.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ArrowsGroup

val ArrowsGroup.SortHorizontal: ImageVector
    get() {
        if (_sortHorizontal != null) {
            return _sortHorizontal!!
        }
        _sortHorizontal = Builder(
            name = "SortHorizontal", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.6634f, 3.4779f)
                curveTo(10.9518f, 3.7753f, 10.9445f, 4.2501f, 10.6471f, 4.5384f)
                lineTo(7.8508f, 7.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 7.25f, 18.75f, 7.5858f, 18.75f, 8.0f)
                curveTo(18.75f, 8.4142f, 18.4142f, 8.75f, 18.0f, 8.75f)
                horizontalLineTo(7.8508f)
                lineTo(10.6471f, 11.4616f)
                curveTo(10.9445f, 11.7499f, 10.9518f, 12.2247f, 10.6634f, 12.5221f)
                curveTo(10.3751f, 12.8195f, 9.9003f, 12.8268f, 9.6029f, 12.5384f)
                lineTo(5.4779f, 8.5384f)
                curveTo(5.3322f, 8.3972f, 5.25f, 8.2029f, 5.25f, 8.0f)
                curveTo(5.25f, 7.7971f, 5.3322f, 7.6028f, 5.4779f, 7.4616f)
                lineTo(9.6029f, 3.4616f)
                curveTo(9.9003f, 3.1732f, 10.3751f, 3.1805f, 10.6634f, 3.4779f)
                close()
                moveTo(13.3366f, 11.4779f)
                curveTo(13.6249f, 11.1805f, 14.0997f, 11.1732f, 14.3971f, 11.4616f)
                lineTo(18.5221f, 15.4616f)
                curveTo(18.6678f, 15.6028f, 18.75f, 15.7971f, 18.75f, 16.0f)
                curveTo(18.75f, 16.2029f, 18.6678f, 16.3972f, 18.5221f, 16.5384f)
                lineTo(14.3971f, 20.5384f)
                curveTo(14.0997f, 20.8268f, 13.6249f, 20.8195f, 13.3366f, 20.5221f)
                curveTo(13.0482f, 20.2247f, 13.0555f, 19.7499f, 13.3529f, 19.4616f)
                lineTo(16.1492f, 16.75f)
                lineTo(6.0f, 16.75f)
                curveTo(5.5858f, 16.75f, 5.25f, 16.4142f, 5.25f, 16.0f)
                curveTo(5.25f, 15.5858f, 5.5858f, 15.25f, 6.0f, 15.25f)
                lineTo(16.1492f, 15.25f)
                lineTo(13.3529f, 12.5384f)
                curveTo(13.0555f, 12.2501f, 13.0482f, 11.7753f, 13.3366f, 11.4779f)
                close()
            }
        }
            .build()
        return _sortHorizontal!!
    }

private var _sortHorizontal: ImageVector? = null
