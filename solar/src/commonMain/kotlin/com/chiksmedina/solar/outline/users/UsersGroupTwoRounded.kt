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
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 3.25f)
                curveTo(17.5858f, 3.25f, 17.25f, 3.5858f, 17.25f, 4.0f)
                curveTo(17.25f, 4.4142f, 17.5858f, 4.75f, 18.0f, 4.75f)
                curveTo(19.3765f, 4.75f, 20.25f, 5.6557f, 20.25f, 6.5f)
                curveTo(20.25f, 7.3443f, 19.3765f, 8.25f, 18.0f, 8.25f)
                curveTo(17.5858f, 8.25f, 17.25f, 8.5858f, 17.25f, 9.0f)
                curveTo(17.25f, 9.4142f, 17.5858f, 9.75f, 18.0f, 9.75f)
                curveTo(19.9372f, 9.75f, 21.75f, 8.4171f, 21.75f, 6.5f)
                curveTo(21.75f, 4.5828f, 19.9372f, 3.25f, 18.0f, 3.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.75f, 4.0f)
                curveTo(6.75f, 3.5858f, 6.4142f, 3.25f, 6.0f, 3.25f)
                curveTo(4.0628f, 3.25f, 2.25f, 4.5828f, 2.25f, 6.5f)
                curveTo(2.25f, 8.4171f, 4.0628f, 9.75f, 6.0f, 9.75f)
                curveTo(6.4142f, 9.75f, 6.75f, 9.4142f, 6.75f, 9.0f)
                curveTo(6.75f, 8.5858f, 6.4142f, 8.25f, 6.0f, 8.25f)
                curveTo(4.6235f, 8.25f, 3.75f, 7.3443f, 3.75f, 6.5f)
                curveTo(3.75f, 5.6557f, 4.6235f, 4.75f, 6.0f, 4.75f)
                curveTo(6.4142f, 4.75f, 6.75f, 4.4142f, 6.75f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 12.25f)
                curveTo(10.2157f, 12.25f, 8.5665f, 12.7308f, 7.3413f, 13.5475f)
                curveTo(6.1215f, 14.3608f, 5.25f, 15.5666f, 5.25f, 17.0f)
                curveTo(5.25f, 18.4334f, 6.1215f, 19.6392f, 7.3413f, 20.4525f)
                curveTo(8.5665f, 21.2692f, 10.2157f, 21.75f, 12.0f, 21.75f)
                curveTo(13.7843f, 21.75f, 15.4335f, 21.2692f, 16.6587f, 20.4525f)
                curveTo(17.8785f, 19.6392f, 18.75f, 18.4334f, 18.75f, 17.0f)
                curveTo(18.75f, 15.5666f, 17.8785f, 14.3608f, 16.6587f, 13.5475f)
                curveTo(15.4335f, 12.7308f, 13.7843f, 12.25f, 12.0f, 12.25f)
                close()
                moveTo(6.75f, 17.0f)
                curveTo(6.75f, 16.2242f, 7.2217f, 15.4301f, 8.1734f, 14.7956f)
                curveTo(9.1198f, 14.1646f, 10.4706f, 13.75f, 12.0f, 13.75f)
                curveTo(13.5294f, 13.75f, 14.8802f, 14.1646f, 15.8266f, 14.7956f)
                curveTo(16.7783f, 15.4301f, 17.25f, 16.2242f, 17.25f, 17.0f)
                curveTo(17.25f, 17.7758f, 16.7783f, 18.5699f, 15.8266f, 19.2044f)
                curveTo(14.8802f, 19.8354f, 13.5294f, 20.25f, 12.0f, 20.25f)
                curveTo(10.4706f, 20.25f, 9.1198f, 19.8354f, 8.1734f, 19.2044f)
                curveTo(7.2217f, 18.5699f, 6.75f, 17.7758f, 6.75f, 17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.2674f, 13.8393f)
                curveTo(19.3561f, 13.4347f, 19.7561f, 13.1787f, 20.1607f, 13.2674f)
                curveTo(21.1225f, 13.4783f, 21.9893f, 13.8593f, 22.6328f, 14.3859f)
                curveTo(23.2758f, 14.912f, 23.75f, 15.6352f, 23.75f, 16.5f)
                curveTo(23.75f, 17.3648f, 23.2758f, 18.088f, 22.6328f, 18.6141f)
                curveTo(21.9893f, 19.1407f, 21.1225f, 19.5217f, 20.1607f, 19.7326f)
                curveTo(19.7561f, 19.8213f, 19.3561f, 19.5653f, 19.2674f, 19.1607f)
                curveTo(19.1787f, 18.7561f, 19.4347f, 18.3561f, 19.8393f, 18.2674f)
                curveTo(20.6317f, 18.0936f, 21.2649f, 17.7952f, 21.6829f, 17.4532f)
                curveTo(22.1014f, 17.1108f, 22.25f, 16.7763f, 22.25f, 16.5f)
                curveTo(22.25f, 16.2237f, 22.1014f, 15.8892f, 21.6829f, 15.5468f)
                curveTo(21.2649f, 15.2048f, 20.6317f, 14.9064f, 19.8393f, 14.7326f)
                curveTo(19.4347f, 14.6439f, 19.1787f, 14.2439f, 19.2674f, 13.8393f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.8393f, 13.2674f)
                curveTo(4.2439f, 13.1787f, 4.6439f, 13.4347f, 4.7326f, 13.8393f)
                curveTo(4.8213f, 14.2439f, 4.5652f, 14.6439f, 4.1606f, 14.7326f)
                curveTo(3.3683f, 14.9064f, 2.735f, 15.2048f, 2.3171f, 15.5468f)
                curveTo(1.8986f, 15.8892f, 1.75f, 16.2237f, 1.75f, 16.5f)
                curveTo(1.75f, 16.7763f, 1.8986f, 17.1108f, 2.3171f, 17.4532f)
                curveTo(2.735f, 17.7952f, 3.3683f, 18.0936f, 4.1606f, 18.2674f)
                curveTo(4.5652f, 18.3561f, 4.8213f, 18.7561f, 4.7326f, 19.1607f)
                curveTo(4.6439f, 19.5653f, 4.2439f, 19.8213f, 3.8393f, 19.7326f)
                curveTo(2.8775f, 19.5217f, 2.0107f, 19.1407f, 1.3672f, 18.6141f)
                curveTo(0.7242f, 18.088f, 0.25f, 17.3648f, 0.25f, 16.5f)
                curveTo(0.25f, 15.6352f, 0.7242f, 14.912f, 1.3672f, 14.3859f)
                curveTo(2.0107f, 13.8593f, 2.8775f, 13.4783f, 3.8393f, 13.2674f)
                close()
            }
        }
            .build()
        return _usersGroupTwoRounded!!
    }

private var _usersGroupTwoRounded: ImageVector? = null
