package com.chiksmedina.solar.outline.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.UsersGroup

val UsersGroup.UserRounded: ImageVector
    get() {
        if (_userRounded != null) {
            return _userRounded!!
        }
        _userRounded = Builder(
            name = "UserRounded", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(9.3766f, 1.25f, 7.25f, 3.3767f, 7.25f, 6.0f)
                curveTo(7.25f, 8.6234f, 9.3766f, 10.75f, 12.0f, 10.75f)
                curveTo(14.6234f, 10.75f, 16.75f, 8.6234f, 16.75f, 6.0f)
                curveTo(16.75f, 3.3767f, 14.6234f, 1.25f, 12.0f, 1.25f)
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
                moveTo(12.0f, 12.25f)
                curveTo(9.9607f, 12.25f, 8.0775f, 12.7208f, 6.6782f, 13.5204f)
                curveTo(5.3f, 14.3079f, 4.25f, 15.5101f, 4.25f, 17.0f)
                curveTo(4.25f, 18.4899f, 5.3f, 19.6921f, 6.6782f, 20.4796f)
                curveTo(8.0775f, 21.2792f, 9.9607f, 21.75f, 12.0f, 21.75f)
                curveTo(14.0393f, 21.75f, 15.9225f, 21.2792f, 17.3219f, 20.4796f)
                curveTo(18.7f, 19.6921f, 19.75f, 18.4899f, 19.75f, 17.0f)
                curveTo(19.75f, 15.5101f, 18.7f, 14.3079f, 17.3219f, 13.5204f)
                curveTo(15.9225f, 12.7208f, 14.0393f, 12.25f, 12.0f, 12.25f)
                close()
                moveTo(5.75f, 17.0f)
                curveTo(5.75f, 16.2807f, 6.267f, 15.483f, 7.4224f, 14.8228f)
                curveTo(8.5565f, 14.1747f, 10.1733f, 13.75f, 12.0f, 13.75f)
                curveTo(13.8267f, 13.75f, 15.4435f, 14.1747f, 16.5776f, 14.8228f)
                curveTo(17.733f, 15.483f, 18.25f, 16.2807f, 18.25f, 17.0f)
                curveTo(18.25f, 17.7193f, 17.733f, 18.517f, 16.5776f, 19.1772f)
                curveTo(15.4435f, 19.8253f, 13.8267f, 20.25f, 12.0f, 20.25f)
                curveTo(10.1733f, 20.25f, 8.5565f, 19.8253f, 7.4224f, 19.1772f)
                curveTo(6.267f, 18.517f, 5.75f, 17.7193f, 5.75f, 17.0f)
                close()
            }
        }
            .build()
        return _userRounded!!
    }

private var _userRounded: ImageVector? = null
