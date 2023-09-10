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

val UsersGroup.UserHeart: ImageVector
    get() {
        if (_userHeart != null) {
            return _userHeart!!
        }
        _userHeart = Builder(
            name = "UserHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0f, 6.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.5126f, 21.4874f)
                curveTo(15.0251f, 22.0f, 15.8501f, 22.0f, 17.5f, 22.0f)
                curveTo(19.1499f, 22.0f, 19.9749f, 22.0f, 20.4874f, 21.4874f)
                curveTo(21.0f, 20.9749f, 21.0f, 20.1499f, 21.0f, 18.5f)
                curveTo(21.0f, 16.8501f, 21.0f, 16.0251f, 20.4874f, 15.5126f)
                curveTo(19.9749f, 15.0f, 19.1499f, 15.0f, 17.5f, 15.0f)
                curveTo(15.8501f, 15.0f, 15.0251f, 15.0f, 14.5126f, 15.5126f)
                curveTo(14.0f, 16.0251f, 14.0f, 16.8501f, 14.0f, 18.5f)
                curveTo(14.0f, 20.1499f, 14.0f, 20.9749f, 14.5126f, 21.4874f)
                close()
                moveTo(16.5266f, 19.9765f)
                curveTo(15.8245f, 19.4738f, 15.0f, 18.8833f, 15.0f, 17.8598f)
                curveTo(15.0f, 16.7299f, 16.375f, 15.9285f, 17.5f, 17.0148f)
                curveTo(18.625f, 15.9285f, 20.0f, 16.7299f, 20.0f, 17.8598f)
                curveTo(20.0f, 18.8833f, 19.1755f, 19.4738f, 18.4734f, 19.9765f)
                curveTo(18.4005f, 20.0287f, 18.3288f, 20.08f, 18.2596f, 20.1308f)
                curveTo(18.0f, 20.3209f, 17.75f, 20.5f, 17.5f, 20.5f)
                curveTo(17.25f, 20.5f, 17.0f, 20.3209f, 16.7404f, 20.1308f)
                curveTo(16.6712f, 20.08f, 16.5995f, 20.0287f, 16.5266f, 19.9765f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5942f, 21.5625f)
                curveTo(14.5661f, 21.5388f, 14.5389f, 21.5138f, 14.5126f, 21.4874f)
                curveTo(14.0f, 20.9749f, 14.0f, 20.1499f, 14.0f, 18.5f)
                curveTo(14.0f, 16.8501f, 14.0f, 16.0251f, 14.5126f, 15.5126f)
                curveTo(15.0251f, 15.0f, 15.8501f, 15.0f, 17.5f, 15.0f)
                curveTo(17.6501f, 15.0f, 17.7933f, 15.0f, 17.9301f, 15.0004f)
                curveTo(16.547f, 13.6551f, 13.9614f, 12.75f, 11.0f, 12.75f)
                curveTo(6.5817f, 12.75f, 3.0f, 14.7647f, 3.0f, 17.25f)
                curveTo(3.0f, 19.7353f, 3.0f, 21.75f, 11.0f, 21.75f)
                curveTo(12.4426f, 21.75f, 13.625f, 21.6845f, 14.5942f, 21.5625f)
                close()
            }
        }
            .build()
        return _userHeart!!
    }

private var _userHeart: ImageVector? = null
