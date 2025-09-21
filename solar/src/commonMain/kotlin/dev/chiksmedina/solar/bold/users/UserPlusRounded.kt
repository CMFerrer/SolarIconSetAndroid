package dev.chiksmedina.solar.bold.users

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
import dev.chiksmedina.solar.bold.UsersGroup

val UsersGroup.UserPlusRounded: ImageVector
    get() {
        if (_userPlusRounded != null) {
            return _userPlusRounded!!
        }
        _userPlusRounded = Builder(
            name = "UserPlusRounded", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 6.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.5f, 22.0f)
                curveTo(14.8501f, 22.0f, 14.0251f, 22.0f, 13.5126f, 21.4874f)
                curveTo(13.0f, 20.9749f, 13.0f, 20.1499f, 13.0f, 18.5f)
                curveTo(13.0f, 16.8501f, 13.0f, 16.0251f, 13.5126f, 15.5126f)
                curveTo(14.0251f, 15.0f, 14.8501f, 15.0f, 16.5f, 15.0f)
                curveTo(18.1499f, 15.0f, 18.9749f, 15.0f, 19.4874f, 15.5126f)
                curveTo(20.0f, 16.0251f, 20.0f, 16.8501f, 20.0f, 18.5f)
                curveTo(20.0f, 20.1499f, 20.0f, 20.9749f, 19.4874f, 21.4874f)
                curveTo(18.9749f, 22.0f, 18.1499f, 22.0f, 16.5f, 22.0f)
                close()
                moveTo(17.0833f, 16.9444f)
                curveTo(17.0833f, 16.6223f, 16.8222f, 16.3611f, 16.5f, 16.3611f)
                curveTo(16.1778f, 16.3611f, 15.9167f, 16.6223f, 15.9167f, 16.9444f)
                verticalLineTo(17.9167f)
                horizontalLineTo(14.9444f)
                curveTo(14.6223f, 17.9167f, 14.3611f, 18.1778f, 14.3611f, 18.5f)
                curveTo(14.3611f, 18.8222f, 14.6223f, 19.0833f, 14.9444f, 19.0833f)
                horizontalLineTo(15.9167f)
                verticalLineTo(20.0556f)
                curveTo(15.9167f, 20.3777f, 16.1778f, 20.6389f, 16.5f, 20.6389f)
                curveTo(16.8222f, 20.6389f, 17.0833f, 20.3777f, 17.0833f, 20.0556f)
                verticalLineTo(19.0833f)
                horizontalLineTo(18.0556f)
                curveTo(18.3777f, 19.0833f, 18.6389f, 18.8222f, 18.6389f, 18.5f)
                curveTo(18.6389f, 18.1778f, 18.3777f, 17.9167f, 18.0556f, 17.9167f)
                horizontalLineTo(17.0833f)
                verticalLineTo(16.9444f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.4147f, 13.5074f)
                curveTo(14.4046f, 13.1842f, 13.24f, 13.0f, 12.0f, 13.0f)
                curveTo(8.134f, 13.0f, 5.0f, 14.7909f, 5.0f, 17.0f)
                curveTo(5.0f, 19.1406f, 7.9424f, 20.8884f, 11.6421f, 20.9949f)
                curveTo(11.615f, 20.8686f, 11.594f, 20.7432f, 11.5775f, 20.6201f)
                curveTo(11.4998f, 20.0424f, 11.4999f, 19.3365f, 11.5f, 18.586f)
                verticalLineTo(18.414f)
                curveTo(11.4999f, 17.6635f, 11.4998f, 16.9576f, 11.5775f, 16.3799f)
                curveTo(11.6639f, 15.737f, 11.8705f, 15.0333f, 12.4519f, 14.4519f)
                curveTo(13.0334f, 13.8705f, 13.737f, 13.6639f, 14.3799f, 13.5774f)
                curveTo(14.6919f, 13.5355f, 15.0412f, 13.5162f, 15.4147f, 13.5074f)
                close()
            }
        }
            .build()
        return _userPlusRounded!!
    }

private var _userPlusRounded: ImageVector? = null
