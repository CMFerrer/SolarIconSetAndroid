package com.chiksmedina.solar.linear.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.UsersGroup

val UsersGroup.UsersGroupTwoRounded: ImageVector
    get() {
        if (_usersGroupTwoRounded != null) {
            return _usersGroupTwoRounded!!
        }
        _usersGroupTwoRounded = Builder(
            name = "UsersGroupTwoRounded", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 6.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 9.0f)
                curveTo(19.6569f, 9.0f, 21.0f, 7.8807f, 21.0f, 6.5f)
                curveTo(21.0f, 5.1193f, 19.6569f, 4.0f, 18.0f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 9.0f)
                curveTo(4.3432f, 9.0f, 3.0f, 7.8807f, 3.0f, 6.5f)
                curveTo(3.0f, 5.1193f, 4.3432f, 4.0f, 6.0f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 17.0f)
                arcToRelative(6.0f, 4.0f, 0.0f, true, false, 12.0f, 0.0f)
                arcToRelative(6.0f, 4.0f, 0.0f, true, false, -12.0f, 0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 19.0f)
                curveTo(21.7542f, 18.6153f, 23.0f, 17.6411f, 23.0f, 16.5f)
                curveTo(23.0f, 15.3589f, 21.7542f, 14.3847f, 20.0f, 14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 19.0f)
                curveTo(2.2457f, 18.6153f, 1.0f, 17.6411f, 1.0f, 16.5f)
                curveTo(1.0f, 15.3589f, 2.2457f, 14.3847f, 4.0f, 14.0f)
            }
        }
            .build()
        return _usersGroupTwoRounded!!
    }

private var _usersGroupTwoRounded: ImageVector? = null
