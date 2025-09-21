package dev.chiksmedina.solar.bold.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.UsersGroup

val UsersGroup.UserId: ImageVector
    get() {
        if (_userId != null) {
            return _userId!!
        }
        _userId = Builder(
            name = "UserId", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 4.0f, 19.6569f, 4.0f, 20.8284f, 5.1716f)
                curveTo(22.0f, 6.3432f, 22.0f, 8.2288f, 22.0f, 12.0f)
                curveTo(22.0f, 15.7712f, 22.0f, 17.6569f, 20.8284f, 18.8284f)
                curveTo(19.6569f, 20.0f, 17.7712f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                curveTo(2.0f, 8.2288f, 2.0f, 6.3432f, 3.1716f, 5.1716f)
                curveTo(4.3432f, 4.0f, 6.2288f, 4.0f, 10.0f, 4.0f)
                close()
                moveTo(13.25f, 9.0f)
                curveTo(13.25f, 8.5858f, 13.5858f, 8.25f, 14.0f, 8.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 8.25f, 19.75f, 8.5858f, 19.75f, 9.0f)
                curveTo(19.75f, 9.4142f, 19.4142f, 9.75f, 19.0f, 9.75f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 9.75f, 13.25f, 9.4142f, 13.25f, 9.0f)
                close()
                moveTo(14.25f, 12.0f)
                curveTo(14.25f, 11.5858f, 14.5858f, 11.25f, 15.0f, 11.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 11.25f, 19.75f, 11.5858f, 19.75f, 12.0f)
                curveTo(19.75f, 12.4142f, 19.4142f, 12.75f, 19.0f, 12.75f)
                horizontalLineTo(15.0f)
                curveTo(14.5858f, 12.75f, 14.25f, 12.4142f, 14.25f, 12.0f)
                close()
                moveTo(15.25f, 15.0f)
                curveTo(15.25f, 14.5858f, 15.5858f, 14.25f, 16.0f, 14.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 14.25f, 19.75f, 14.5858f, 19.75f, 15.0f)
                curveTo(19.75f, 15.4142f, 19.4142f, 15.75f, 19.0f, 15.75f)
                horizontalLineTo(16.0f)
                curveTo(15.5858f, 15.75f, 15.25f, 15.4142f, 15.25f, 15.0f)
                close()
                moveTo(11.0f, 9.0f)
                curveTo(11.0f, 10.1046f, 10.1046f, 11.0f, 9.0f, 11.0f)
                curveTo(7.8954f, 11.0f, 7.0f, 10.1046f, 7.0f, 9.0f)
                curveTo(7.0f, 7.8954f, 7.8954f, 7.0f, 9.0f, 7.0f)
                curveTo(10.1046f, 7.0f, 11.0f, 7.8954f, 11.0f, 9.0f)
                close()
                moveTo(9.0f, 17.0f)
                curveTo(13.0f, 17.0f, 13.0f, 16.1046f, 13.0f, 15.0f)
                curveTo(13.0f, 13.8954f, 11.2091f, 13.0f, 9.0f, 13.0f)
                curveTo(6.7909f, 13.0f, 5.0f, 13.8954f, 5.0f, 15.0f)
                curveTo(5.0f, 16.1046f, 5.0f, 17.0f, 9.0f, 17.0f)
                close()
            }
        }
            .build()
        return _userId!!
    }

private var _userId: ImageVector? = null
