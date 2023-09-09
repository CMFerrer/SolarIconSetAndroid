package com.chiksmedina.solar.boldduotone.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.UsersGroup

public val UsersGroup.UserSpeakRounded: ImageVector
    get() {
        if (_userSpeakRounded != null) {
            return _userSpeakRounded!!
        }
        _userSpeakRounded = Builder(name = "UserSpeakRounded", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.75f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 17.75f)
                arcToRelative(7.0f, 4.0f, 0.0f, true, false, 14.0f, 0.0f)
                arcToRelative(7.0f, 4.0f, 0.0f, true, false, -14.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.357f, 2.3642f)
                curveTo(18.5702f, 2.0091f, 19.0309f, 1.8939f, 19.386f, 2.107f)
                lineTo(19.0002f, 2.7501f)
                curveTo(19.386f, 2.107f, 19.3857f, 2.1068f, 19.386f, 2.107f)
                lineTo(19.3874f, 2.1078f)
                lineTo(19.389f, 2.1088f)
                lineTo(19.3927f, 2.111f)
                lineTo(19.4023f, 2.117f)
                curveTo(19.4096f, 2.1215f, 19.4189f, 2.1274f, 19.4299f, 2.1345f)
                curveTo(19.4519f, 2.1487f, 19.481f, 2.1681f, 19.5162f, 2.1927f)
                curveTo(19.5865f, 2.2419f, 19.6815f, 2.3124f, 19.7928f, 2.4052f)
                curveTo(20.0149f, 2.5903f, 20.3054f, 2.8668f, 20.5946f, 3.2428f)
                curveTo(21.1775f, 4.0006f, 21.7502f, 5.1575f, 21.7502f, 6.7501f)
                curveTo(21.7502f, 8.3428f, 21.1775f, 9.4997f, 20.5946f, 10.2574f)
                curveTo(20.3054f, 10.6334f, 20.0149f, 10.9099f, 19.7928f, 11.095f)
                curveTo(19.6815f, 11.1878f, 19.5865f, 11.2583f, 19.5162f, 11.3075f)
                curveTo(19.481f, 11.3321f, 19.4519f, 11.3515f, 19.4299f, 11.3657f)
                curveTo(19.4189f, 11.3729f, 19.4096f, 11.3787f, 19.4023f, 11.3833f)
                lineTo(19.3927f, 11.3892f)
                lineTo(19.389f, 11.3914f)
                lineTo(19.3874f, 11.3924f)
                curveTo(19.3871f, 11.3926f, 19.386f, 11.3932f, 19.0002f, 10.7501f)
                lineTo(19.386f, 11.3932f)
                curveTo(19.0309f, 11.6063f, 18.5702f, 11.4912f, 18.357f, 11.136f)
                curveTo(18.1448f, 10.7823f, 18.2581f, 10.324f, 18.6098f, 10.1097f)
                lineTo(18.6154f, 10.1062f)
                curveTo(18.6227f, 10.1014f, 18.6365f, 10.0923f, 18.656f, 10.0787f)
                curveTo(18.6951f, 10.0513f, 18.7563f, 10.0062f, 18.8325f, 9.9427f)
                curveTo(18.9854f, 9.8153f, 19.195f, 9.6168f, 19.4057f, 9.3428f)
                curveTo(19.8228f, 8.8006f, 20.2502f, 7.9575f, 20.2502f, 6.7501f)
                curveTo(20.2502f, 5.5428f, 19.8228f, 4.6997f, 19.4057f, 4.1574f)
                curveTo(19.195f, 3.8835f, 18.9854f, 3.6849f, 18.8325f, 3.5575f)
                curveTo(18.7563f, 3.494f, 18.6951f, 3.4489f, 18.656f, 3.4216f)
                curveTo(18.6365f, 3.4079f, 18.6227f, 3.3988f, 18.6154f, 3.3941f)
                lineTo(18.6098f, 3.3905f)
                curveTo(18.2581f, 3.1762f, 18.1448f, 2.7179f, 18.357f, 2.3642f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.3293f, 4.4147f)
                curveTo(16.5146f, 4.0442f, 16.9651f, 3.894f, 17.3356f, 4.0793f)
                lineTo(17.0002f, 4.7501f)
                curveTo(17.3356f, 4.0793f, 17.3352f, 4.0791f, 17.3356f, 4.0793f)
                lineTo(17.3372f, 4.0801f)
                lineTo(17.3389f, 4.081f)
                lineTo(17.3426f, 4.0829f)
                lineTo(17.3512f, 4.0873f)
                lineTo(17.3728f, 4.0989f)
                curveTo(17.3891f, 4.1079f, 17.4091f, 4.1193f, 17.4324f, 4.1334f)
                curveTo(17.4787f, 4.1616f, 17.5383f, 4.2006f, 17.6064f, 4.2517f)
                curveTo(17.7423f, 4.3536f, 17.9153f, 4.5059f, 18.0858f, 4.7191f)
                curveTo(18.4345f, 5.155f, 18.7502f, 5.8179f, 18.7502f, 6.7501f)
                curveTo(18.7502f, 7.6823f, 18.4345f, 8.3452f, 18.0858f, 8.7811f)
                curveTo(17.9153f, 8.9943f, 17.7423f, 9.1466f, 17.6064f, 9.2486f)
                curveTo(17.5383f, 9.2997f, 17.4787f, 9.3386f, 17.4324f, 9.3668f)
                curveTo(17.4091f, 9.3809f, 17.3891f, 9.3923f, 17.3728f, 9.4013f)
                lineTo(17.3512f, 9.4129f)
                lineTo(17.3426f, 9.4174f)
                lineTo(17.3389f, 9.4192f)
                lineTo(17.3372f, 9.4201f)
                curveTo(17.3368f, 9.4203f, 17.3356f, 9.4209f, 17.0064f, 8.7627f)
                lineTo(17.3356f, 9.4209f)
                curveTo(16.9651f, 9.6062f, 16.5146f, 9.456f, 16.3293f, 9.0855f)
                curveTo(16.1464f, 8.7197f, 16.2906f, 8.2757f, 16.651f, 8.0863f)
                curveTo(16.6518f, 8.0859f, 16.6527f, 8.0853f, 16.6539f, 8.0846f)
                curveTo(16.6622f, 8.0796f, 16.6808f, 8.0678f, 16.7064f, 8.0485f)
                curveTo(16.758f, 8.0099f, 16.8351f, 7.9434f, 16.9145f, 7.8441f)
                curveTo(17.0658f, 7.655f, 17.2502f, 7.3179f, 17.2502f, 6.7501f)
                curveTo(17.2502f, 6.1823f, 17.0658f, 5.8452f, 16.9145f, 5.6561f)
                curveTo(16.8351f, 5.5568f, 16.758f, 5.4903f, 16.7064f, 5.4517f)
                curveTo(16.6808f, 5.4325f, 16.6622f, 5.4207f, 16.6539f, 5.4156f)
                curveTo(16.6527f, 5.4149f, 16.6518f, 5.4143f, 16.651f, 5.4139f)
                curveTo(16.2906f, 5.2245f, 16.1464f, 4.7806f, 16.3293f, 4.4147f)
                close()
            }
        }
        .build()
        return _userSpeakRounded!!
    }

private var _userSpeakRounded: ImageVector? = null
