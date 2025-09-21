package dev.chiksmedina.solar.outline.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ListGroup

val ListGroup.SortByTime: ImageVector
    get() {
        if (_sortByTime != null) {
            return _sortByTime!!
        }
        _sortByTime = Builder(
            name = "SortByTime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 7.0f)
                curveTo(1.25f, 6.5858f, 1.5858f, 6.25f, 2.0f, 6.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 6.25f, 10.75f, 6.5858f, 10.75f, 7.0f)
                curveTo(10.75f, 7.4142f, 10.4142f, 7.75f, 10.0f, 7.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 7.75f, 1.25f, 7.4142f, 1.25f, 7.0f)
                close()
                moveTo(17.0f, 7.75f)
                curveTo(14.6528f, 7.75f, 12.75f, 9.6528f, 12.75f, 12.0f)
                curveTo(12.75f, 14.3472f, 14.6528f, 16.25f, 17.0f, 16.25f)
                curveTo(19.3472f, 16.25f, 21.25f, 14.3472f, 21.25f, 12.0f)
                curveTo(21.25f, 9.6528f, 19.3472f, 7.75f, 17.0f, 7.75f)
                close()
                moveTo(11.25f, 12.0f)
                curveTo(11.25f, 8.8244f, 13.8244f, 6.25f, 17.0f, 6.25f)
                curveTo(20.1756f, 6.25f, 22.75f, 8.8244f, 22.75f, 12.0f)
                curveTo(22.75f, 15.1756f, 20.1756f, 17.75f, 17.0f, 17.75f)
                curveTo(13.8244f, 17.75f, 11.25f, 15.1756f, 11.25f, 12.0f)
                close()
                moveTo(17.0f, 9.25f)
                curveTo(17.4142f, 9.25f, 17.75f, 9.5858f, 17.75f, 10.0f)
                verticalLineTo(11.5664f)
                lineTo(18.5668f, 12.5088f)
                curveTo(18.838f, 12.8218f, 18.8042f, 13.2955f, 18.4912f, 13.5668f)
                curveTo(18.1782f, 13.838f, 17.7045f, 13.8042f, 17.4332f, 13.4912f)
                lineTo(16.4332f, 12.3374f)
                curveTo(16.3151f, 12.201f, 16.25f, 12.0266f, 16.25f, 11.8462f)
                verticalLineTo(10.0f)
                curveTo(16.25f, 9.5858f, 16.5858f, 9.25f, 17.0f, 9.25f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 11.25f, 8.75f, 11.5858f, 8.75f, 12.0f)
                curveTo(8.75f, 12.4142f, 8.4142f, 12.75f, 8.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                close()
                moveTo(1.25f, 17.0f)
                curveTo(1.25f, 16.5858f, 1.5858f, 16.25f, 2.0f, 16.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 16.25f, 10.75f, 16.5858f, 10.75f, 17.0f)
                curveTo(10.75f, 17.4142f, 10.4142f, 17.75f, 10.0f, 17.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 17.75f, 1.25f, 17.4142f, 1.25f, 17.0f)
                close()
            }
        }
            .build()
        return _sortByTime!!
    }

private var _sortByTime: ImageVector? = null
