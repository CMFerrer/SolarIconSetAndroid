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

val ArrowsGroup.SortVertical: ImageVector
    get() {
        if (_sortVertical != null) {
            return _sortVertical!!
        }
        _sortVertical = Builder(
            name = "SortVertical", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.0f, 5.25f)
                curveTo(16.2029f, 5.25f, 16.3972f, 5.3322f, 16.5384f, 5.4779f)
                lineTo(20.5384f, 9.6029f)
                curveTo(20.8268f, 9.9003f, 20.8195f, 10.3751f, 20.5221f, 10.6634f)
                curveTo(20.2247f, 10.9518f, 19.7499f, 10.9445f, 19.4616f, 10.6471f)
                lineTo(16.75f, 7.8508f)
                lineTo(16.75f, 18.0f)
                curveTo(16.75f, 18.4142f, 16.4142f, 18.75f, 16.0f, 18.75f)
                curveTo(15.5858f, 18.75f, 15.25f, 18.4142f, 15.25f, 18.0f)
                lineTo(15.25f, 7.8508f)
                lineTo(12.5384f, 10.6471f)
                curveTo(12.2501f, 10.9445f, 11.7753f, 10.9518f, 11.4779f, 10.6634f)
                curveTo(11.1805f, 10.3751f, 11.1732f, 9.9003f, 11.4616f, 9.6029f)
                lineTo(15.4616f, 5.4779f)
                curveTo(15.6028f, 5.3322f, 15.7971f, 5.25f, 16.0f, 5.25f)
                close()
                moveTo(8.0f, 5.25f)
                curveTo(8.4142f, 5.25f, 8.75f, 5.5858f, 8.75f, 6.0f)
                lineTo(8.75f, 16.1492f)
                lineTo(11.4616f, 13.3529f)
                curveTo(11.7499f, 13.0555f, 12.2247f, 13.0482f, 12.5221f, 13.3366f)
                curveTo(12.8195f, 13.6249f, 12.8268f, 14.0997f, 12.5384f, 14.3971f)
                lineTo(8.5384f, 18.5221f)
                curveTo(8.3972f, 18.6678f, 8.2029f, 18.75f, 8.0f, 18.75f)
                curveTo(7.7971f, 18.75f, 7.6028f, 18.6678f, 7.4616f, 18.5221f)
                lineTo(3.4616f, 14.3971f)
                curveTo(3.1732f, 14.0997f, 3.1805f, 13.6249f, 3.4779f, 13.3366f)
                curveTo(3.7753f, 13.0482f, 4.2501f, 13.0555f, 4.5384f, 13.3529f)
                lineTo(7.25f, 16.1492f)
                lineTo(7.25f, 6.0f)
                curveTo(7.25f, 5.5858f, 7.5858f, 5.25f, 8.0f, 5.25f)
                close()
            }
        }
            .build()
        return _sortVertical!!
    }

private var _sortVertical: ImageVector? = null
