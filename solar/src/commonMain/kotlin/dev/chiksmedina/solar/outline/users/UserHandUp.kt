package dev.chiksmedina.solar.outline.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.UsersGroup

val UsersGroup.UserHandUp: ImageVector
    get() {
        if (_userHandUp != null) {
            return _userHandUp!!
        }
        _userHandUp = Builder(
            name = "UserHandUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(9.3766f, 1.25f, 7.25f, 3.3767f, 7.25f, 6.0f)
                curveTo(7.25f, 8.6234f, 9.3766f, 10.75f, 12.0f, 10.75f)
                curveTo(14.6233f, 10.75f, 16.75f, 8.6234f, 16.75f, 6.0f)
                curveTo(16.75f, 3.3767f, 14.6233f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(8.75f, 6.0f)
                curveTo(8.75f, 4.2051f, 10.2051f, 2.75f, 12.0f, 2.75f)
                curveTo(13.7949f, 2.75f, 15.25f, 4.2051f, 15.25f, 6.0f)
                curveTo(15.25f, 7.7949f, 13.7949f, 9.25f, 12.0f, 9.25f)
                curveTo(10.2051f, 9.25f, 8.75f, 7.7949f, 8.75f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.7276f, 5.8181f)
                curveTo(2.6271f, 5.4163f, 2.2199f, 5.1719f, 1.8181f, 5.2724f)
                curveTo(1.4162f, 5.3728f, 1.1719f, 5.7801f, 1.2724f, 6.1819f)
                lineTo(1.6544f, 7.7098f)
                curveTo(2.3591f, 10.5288f, 4.4959f, 12.7496f, 7.25f, 13.5787f)
                lineTo(7.25f, 18.052f)
                curveTo(7.25f, 18.9505f, 7.2499f, 19.6997f, 7.3299f, 20.2945f)
                curveTo(7.4143f, 20.9223f, 7.6f, 21.4891f, 8.0555f, 21.9445f)
                curveTo(8.5109f, 22.4f, 9.0777f, 22.5857f, 9.7055f, 22.6701f)
                curveTo(10.3003f, 22.7501f, 11.0495f, 22.75f, 11.948f, 22.75f)
                horizontalLineTo(12.052f)
                curveTo(12.9505f, 22.75f, 13.6997f, 22.7501f, 14.2945f, 22.6701f)
                curveTo(14.9223f, 22.5857f, 15.4891f, 22.4f, 15.9445f, 21.9445f)
                curveTo(16.4f, 21.4891f, 16.5857f, 20.9223f, 16.6701f, 20.2945f)
                curveTo(16.75f, 19.6997f, 16.75f, 18.9505f, 16.75f, 18.052f)
                lineTo(16.75f, 13.859f)
                curveTo(17.7311f, 14.1515f, 18.4806f, 15.0039f, 18.6056f, 16.0671f)
                lineTo(19.2551f, 21.5876f)
                curveTo(19.3035f, 21.999f, 19.6762f, 22.2933f, 20.0876f, 22.2449f)
                curveTo(20.499f, 22.1965f, 20.7932f, 21.8237f, 20.7449f, 21.4124f)
                lineTo(20.0954f, 15.8918f)
                curveTo(19.8511f, 13.8151f, 18.091f, 12.25f, 16.0f, 12.25f)
                horizontalLineTo(8.0845f)
                curveTo(5.6411f, 11.6764f, 3.7194f, 9.7852f, 3.1096f, 7.346f)
                lineTo(2.7276f, 5.8181f)
                close()
                moveTo(8.75f, 18.0f)
                verticalLineTo(13.75f)
                horizontalLineTo(15.25f)
                verticalLineTo(18.0f)
                curveTo(15.25f, 18.964f, 15.2484f, 19.6116f, 15.1835f, 20.0946f)
                curveTo(15.1214f, 20.5561f, 15.0142f, 20.7536f, 14.8839f, 20.8839f)
                curveTo(14.7536f, 21.0142f, 14.5561f, 21.1214f, 14.0946f, 21.1835f)
                curveTo(13.6116f, 21.2484f, 12.964f, 21.25f, 12.0f, 21.25f)
                curveTo(11.036f, 21.25f, 10.3884f, 21.2484f, 9.9054f, 21.1835f)
                curveTo(9.4439f, 21.1214f, 9.2464f, 21.0142f, 9.1161f, 20.8839f)
                curveTo(8.9858f, 20.7536f, 8.8786f, 20.5561f, 8.8165f, 20.0946f)
                curveTo(8.7516f, 19.6116f, 8.75f, 18.964f, 8.75f, 18.0f)
                close()
            }
        }
            .build()
        return _userHandUp!!
    }

private var _userHandUp: ImageVector? = null
