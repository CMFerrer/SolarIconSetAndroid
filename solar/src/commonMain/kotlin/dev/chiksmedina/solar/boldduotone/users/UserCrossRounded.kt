package dev.chiksmedina.solar.boldduotone.users

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
import dev.chiksmedina.solar.boldduotone.UsersGroup

val UsersGroup.UserCrossRounded: ImageVector
    get() {
        if (_userCrossRounded != null) {
            return _userCrossRounded!!
        }
        _userCrossRounded = Builder(
            name = "UserCrossRounded", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
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
                moveTo(15.3569f, 16.532f)
                curveTo(15.1291f, 16.3042f, 14.7598f, 16.3042f, 14.532f, 16.532f)
                curveTo(14.3042f, 16.7598f, 14.3042f, 17.1291f, 14.532f, 17.3569f)
                lineTo(15.675f, 18.5f)
                lineTo(14.532f, 19.6431f)
                curveTo(14.3042f, 19.8709f, 14.3042f, 20.2402f, 14.532f, 20.468f)
                curveTo(14.7598f, 20.6958f, 15.1291f, 20.6958f, 15.3569f, 20.468f)
                lineTo(16.5f, 19.325f)
                lineTo(17.6431f, 20.468f)
                curveTo(17.8709f, 20.6958f, 18.2402f, 20.6958f, 18.468f, 20.468f)
                curveTo(18.6958f, 20.2402f, 18.6958f, 19.8709f, 18.468f, 19.6431f)
                lineTo(17.325f, 18.5f)
                lineTo(18.468f, 17.3569f)
                curveTo(18.6958f, 17.1291f, 18.6958f, 16.7598f, 18.468f, 16.532f)
                curveTo(18.2402f, 16.3042f, 17.8709f, 16.3042f, 17.6431f, 16.532f)
                lineTo(16.5f, 17.675f)
                lineTo(15.3569f, 16.532f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0947f, 15.0312f)
                curveTo(17.6699f, 15.0f, 17.1487f, 15.0f, 16.5f, 15.0f)
                curveTo(14.8501f, 15.0f, 14.0251f, 15.0f, 13.5126f, 15.5126f)
                curveTo(13.0f, 16.0251f, 13.0f, 16.8501f, 13.0f, 18.5f)
                curveTo(13.0f, 19.6663f, 13.0f, 20.4204f, 13.1811f, 20.9433f)
                curveTo(12.7971f, 20.9806f, 12.4025f, 21.0f, 12.0f, 21.0f)
                curveTo(8.134f, 21.0f, 5.0f, 19.2091f, 5.0f, 17.0f)
                curveTo(5.0f, 14.7909f, 8.134f, 13.0f, 12.0f, 13.0f)
                curveTo(14.6134f, 13.0f, 16.8924f, 13.8184f, 18.0947f, 15.0312f)
                close()
            }
        }
            .build()
        return _userCrossRounded!!
    }

private var _userCrossRounded: ImageVector? = null
