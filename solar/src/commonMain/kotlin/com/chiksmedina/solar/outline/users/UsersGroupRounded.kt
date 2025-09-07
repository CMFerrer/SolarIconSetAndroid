package com.chiksmedina.solar.outline.users

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
import com.chiksmedina.solar.outline.UsersGroup

val UsersGroup.UsersGroupRounded: ImageVector
    get() {
        if (_usersGroupRounded != null) {
            return _usersGroupRounded!!
        }
        _usersGroupRounded = Builder(
            name = "UsersGroupRounded", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.0f, 1.25f)
                curveTo(6.3766f, 1.25f, 4.25f, 3.3767f, 4.25f, 6.0f)
                curveTo(4.25f, 8.6234f, 6.3766f, 10.75f, 9.0f, 10.75f)
                curveTo(11.6234f, 10.75f, 13.75f, 8.6234f, 13.75f, 6.0f)
                curveTo(13.75f, 3.3767f, 11.6234f, 1.25f, 9.0f, 1.25f)
                close()
                moveTo(5.75f, 6.0f)
                curveTo(5.75f, 4.2051f, 7.2051f, 2.75f, 9.0f, 2.75f)
                curveTo(10.7949f, 2.75f, 12.25f, 4.2051f, 12.25f, 6.0f)
                curveTo(12.25f, 7.7949f, 10.7949f, 9.25f, 9.0f, 9.25f)
                curveTo(7.2051f, 9.25f, 5.75f, 7.7949f, 5.75f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 2.25f)
                curveTo(14.5858f, 2.25f, 14.25f, 2.5858f, 14.25f, 3.0f)
                curveTo(14.25f, 3.4142f, 14.5858f, 3.75f, 15.0f, 3.75f)
                curveTo(16.2426f, 3.75f, 17.25f, 4.7574f, 17.25f, 6.0f)
                curveTo(17.25f, 7.2426f, 16.2426f, 8.25f, 15.0f, 8.25f)
                curveTo(14.5858f, 8.25f, 14.25f, 8.5858f, 14.25f, 9.0f)
                curveTo(14.25f, 9.4142f, 14.5858f, 9.75f, 15.0f, 9.75f)
                curveTo(17.0711f, 9.75f, 18.75f, 8.0711f, 18.75f, 6.0f)
                curveTo(18.75f, 3.9289f, 17.0711f, 2.25f, 15.0f, 2.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.6781f, 13.5204f)
                curveTo(5.0775f, 12.7208f, 6.9607f, 12.25f, 9.0f, 12.25f)
                curveTo(11.0393f, 12.25f, 12.9225f, 12.7208f, 14.3219f, 13.5204f)
                curveTo(15.7f, 14.3079f, 16.75f, 15.5101f, 16.75f, 17.0f)
                curveTo(16.75f, 18.4899f, 15.7f, 19.6921f, 14.3219f, 20.4796f)
                curveTo(12.9225f, 21.2792f, 11.0393f, 21.75f, 9.0f, 21.75f)
                curveTo(6.9607f, 21.75f, 5.0775f, 21.2792f, 3.6781f, 20.4796f)
                curveTo(2.3f, 19.6921f, 1.25f, 18.4899f, 1.25f, 17.0f)
                curveTo(1.25f, 15.5101f, 2.3f, 14.3079f, 3.6781f, 13.5204f)
                close()
                moveTo(4.4224f, 14.8228f)
                curveTo(3.267f, 15.483f, 2.75f, 16.2807f, 2.75f, 17.0f)
                curveTo(2.75f, 17.7193f, 3.267f, 18.517f, 4.4224f, 19.1772f)
                curveTo(5.5565f, 19.8253f, 7.1733f, 20.25f, 9.0f, 20.25f)
                curveTo(10.8267f, 20.25f, 12.4435f, 19.8253f, 13.5776f, 19.1772f)
                curveTo(14.733f, 18.517f, 15.25f, 17.7193f, 15.25f, 17.0f)
                curveTo(15.25f, 16.2807f, 14.733f, 15.483f, 13.5776f, 14.8228f)
                curveTo(12.4435f, 14.1747f, 10.8267f, 13.75f, 9.0f, 13.75f)
                curveTo(7.1733f, 13.75f, 5.5565f, 14.1747f, 4.4224f, 14.8228f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.1607f, 13.2674f)
                curveTo(17.7561f, 13.1787f, 17.3561f, 13.4347f, 17.2674f, 13.8393f)
                curveTo(17.1787f, 14.2439f, 17.4347f, 14.6439f, 17.8393f, 14.7326f)
                curveTo(18.6317f, 14.9064f, 19.2649f, 15.2048f, 19.6829f, 15.5468f)
                curveTo(20.1014f, 15.8892f, 20.25f, 16.2237f, 20.25f, 16.5f)
                curveTo(20.25f, 16.7507f, 20.1294f, 17.045f, 19.7969f, 17.3539f)
                curveTo(19.462f, 17.665f, 18.9475f, 17.9524f, 18.2838f, 18.1523f)
                curveTo(17.8871f, 18.2717f, 17.6624f, 18.69f, 17.7818f, 19.0867f)
                curveTo(17.9013f, 19.4833f, 18.3196f, 19.708f, 18.7162f, 19.5886f)
                curveTo(19.5388f, 19.3409f, 20.2743f, 18.9578f, 20.8178f, 18.4529f)
                curveTo(21.3637f, 17.9457f, 21.75f, 17.2786f, 21.75f, 16.5f)
                curveTo(21.75f, 15.6352f, 21.2758f, 14.912f, 20.6328f, 14.3859f)
                curveTo(19.9893f, 13.8593f, 19.1225f, 13.4783f, 18.1607f, 13.2674f)
                close()
            }
        }
            .build()
        return _usersGroupRounded!!
    }

private var _usersGroupRounded: ImageVector? = null
