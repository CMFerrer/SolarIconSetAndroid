package com.chiksmedina.solar.boldduotone.users

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
import com.chiksmedina.solar.boldduotone.UsersGroup

val UsersGroup.UserCheckRounded: ImageVector
    get() {
        if (_userCheckRounded != null) {
            return _userCheckRounded!!
        }
        _userCheckRounded = Builder(
            name = "UserCheckRounded", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(18.468f, 17.7458f)
                curveTo(18.6958f, 17.518f, 18.6958f, 17.1487f, 18.468f, 16.9209f)
                curveTo(18.2402f, 16.693f, 17.8709f, 16.693f, 17.6431f, 16.9209f)
                lineTo(15.7222f, 18.8417f)
                lineTo(15.3569f, 18.4764f)
                curveTo(15.1291f, 18.2486f, 14.7598f, 18.2486f, 14.532f, 18.4764f)
                curveTo(14.3042f, 18.7042f, 14.3042f, 19.0736f, 14.532f, 19.3014f)
                lineTo(15.3097f, 20.0791f)
                curveTo(15.5375f, 20.307f, 15.9069f, 20.307f, 16.1347f, 20.0791f)
                lineTo(18.468f, 17.7458f)
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
        return _userCheckRounded!!
    }

private var _userCheckRounded: ImageVector? = null
