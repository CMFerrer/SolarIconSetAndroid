package dev.chiksmedina.solar.bold.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SchoolGroup

val SchoolGroup.Calculator: ImageVector
    get() {
        if (_calculator != null) {
            return _calculator!!
        }
        _calculator = Builder(
            name = "Calculator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.7574f, 22.0f, 5.636f, 22.0f, 4.318f, 20.5355f)
                curveTo(3.0f, 19.0711f, 3.0f, 16.714f, 3.0f, 12.0f)
                curveTo(3.0f, 7.286f, 3.0f, 4.9289f, 4.318f, 3.4645f)
                curveTo(5.636f, 2.0f, 7.7574f, 2.0f, 12.0f, 2.0f)
                curveTo(16.2426f, 2.0f, 18.364f, 2.0f, 19.682f, 3.4645f)
                curveTo(21.0f, 4.9289f, 21.0f, 7.286f, 21.0f, 12.0f)
                curveTo(21.0f, 16.714f, 21.0f, 19.0711f, 19.682f, 20.5355f)
                curveTo(18.364f, 22.0f, 16.2426f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(15.0f, 6.0f)
                horizontalLineTo(9.0f)
                curveTo(8.535f, 6.0f, 8.3025f, 6.0f, 8.1118f, 6.0511f)
                curveTo(7.5941f, 6.1898f, 7.1898f, 6.5941f, 7.0511f, 7.1118f)
                curveTo(7.0f, 7.3025f, 7.0f, 7.535f, 7.0f, 8.0f)
                curveTo(7.0f, 8.465f, 7.0f, 8.6975f, 7.0511f, 8.8882f)
                curveTo(7.1898f, 9.4059f, 7.5941f, 9.8102f, 8.1118f, 9.9489f)
                curveTo(8.3025f, 10.0f, 8.535f, 10.0f, 9.0f, 10.0f)
                horizontalLineTo(15.0f)
                curveTo(15.465f, 10.0f, 15.6975f, 10.0f, 15.8882f, 9.9489f)
                curveTo(16.4059f, 9.8102f, 16.8102f, 9.4059f, 16.9489f, 8.8882f)
                curveTo(17.0f, 8.6975f, 17.0f, 8.465f, 17.0f, 8.0f)
                curveTo(17.0f, 7.535f, 17.0f, 7.3025f, 16.9489f, 7.1118f)
                curveTo(16.8102f, 6.5941f, 16.4059f, 6.1898f, 15.8882f, 6.0511f)
                curveTo(15.6975f, 6.0f, 15.465f, 6.0f, 15.0f, 6.0f)
                close()
                moveTo(9.0f, 13.0f)
                curveTo(9.0f, 13.5523f, 8.5523f, 14.0f, 8.0f, 14.0f)
                curveTo(7.4477f, 14.0f, 7.0f, 13.5523f, 7.0f, 13.0f)
                curveTo(7.0f, 12.4477f, 7.4477f, 12.0f, 8.0f, 12.0f)
                curveTo(8.5523f, 12.0f, 9.0f, 12.4477f, 9.0f, 13.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(12.5523f, 14.0f, 13.0f, 13.5523f, 13.0f, 13.0f)
                curveTo(13.0f, 12.4477f, 12.5523f, 12.0f, 12.0f, 12.0f)
                curveTo(11.4477f, 12.0f, 11.0f, 12.4477f, 11.0f, 13.0f)
                curveTo(11.0f, 13.5523f, 11.4477f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(17.0f, 13.0f)
                curveTo(17.0f, 13.5523f, 16.5523f, 14.0f, 16.0f, 14.0f)
                curveTo(15.4477f, 14.0f, 15.0f, 13.5523f, 15.0f, 13.0f)
                curveTo(15.0f, 12.4477f, 15.4477f, 12.0f, 16.0f, 12.0f)
                curveTo(16.5523f, 12.0f, 17.0f, 12.4477f, 17.0f, 13.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(16.5523f, 18.0f, 17.0f, 17.5523f, 17.0f, 17.0f)
                curveTo(17.0f, 16.4477f, 16.5523f, 16.0f, 16.0f, 16.0f)
                curveTo(15.4477f, 16.0f, 15.0f, 16.4477f, 15.0f, 17.0f)
                curveTo(15.0f, 17.5523f, 15.4477f, 18.0f, 16.0f, 18.0f)
                close()
                moveTo(13.0f, 17.0f)
                curveTo(13.0f, 17.5523f, 12.5523f, 18.0f, 12.0f, 18.0f)
                curveTo(11.4477f, 18.0f, 11.0f, 17.5523f, 11.0f, 17.0f)
                curveTo(11.0f, 16.4477f, 11.4477f, 16.0f, 12.0f, 16.0f)
                curveTo(12.5523f, 16.0f, 13.0f, 16.4477f, 13.0f, 17.0f)
                close()
                moveTo(8.0f, 18.0f)
                curveTo(8.5523f, 18.0f, 9.0f, 17.5523f, 9.0f, 17.0f)
                curveTo(9.0f, 16.4477f, 8.5523f, 16.0f, 8.0f, 16.0f)
                curveTo(7.4477f, 16.0f, 7.0f, 16.4477f, 7.0f, 17.0f)
                curveTo(7.0f, 17.5523f, 7.4477f, 18.0f, 8.0f, 18.0f)
                close()
            }
        }
            .build()
        return _calculator!!
    }

private var _calculator: ImageVector? = null
