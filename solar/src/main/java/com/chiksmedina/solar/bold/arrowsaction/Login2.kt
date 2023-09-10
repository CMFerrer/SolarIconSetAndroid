package com.chiksmedina.solar.bold.arrowsaction

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
import com.chiksmedina.solar.bold.ArrowsActionGroup

val ArrowsActionGroup.Login2: ImageVector
    get() {
        if (_login2 != null) {
            return _login2!!
        }
        _login2 = Builder(
            name = "Login2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.625f, 12.0f)
                curveTo(1.625f, 12.4142f, 1.9608f, 12.75f, 2.375f, 12.75f)
                lineTo(13.3476f, 12.75f)
                lineTo(11.3869f, 14.4306f)
                curveTo(11.0724f, 14.7001f, 11.036f, 15.1736f, 11.3056f, 15.4881f)
                curveTo(11.5751f, 15.8026f, 12.0486f, 15.839f, 12.3631f, 15.5694f)
                lineTo(15.8631f, 12.5694f)
                curveTo(16.0293f, 12.427f, 16.125f, 12.2189f, 16.125f, 12.0f)
                curveTo(16.125f, 11.7811f, 16.0293f, 11.573f, 15.8631f, 11.4306f)
                lineTo(12.3631f, 8.4306f)
                curveTo(12.0486f, 8.161f, 11.5751f, 8.1974f, 11.3056f, 8.5119f)
                curveTo(11.036f, 8.8264f, 11.0724f, 9.2999f, 11.3869f, 9.5694f)
                lineTo(13.3476f, 11.25f)
                lineTo(2.375f, 11.25f)
                curveTo(1.9608f, 11.25f, 1.625f, 11.5858f, 1.625f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.375f, 9.75f)
                lineTo(9.7533f, 9.75f)
                curveTo(9.4947f, 9.0164f, 9.6241f, 8.1688f, 10.1667f, 7.5358f)
                curveTo(10.9754f, 6.5923f, 12.3958f, 6.483f, 13.3393f, 7.2917f)
                lineTo(16.8393f, 10.2917f)
                curveTo(17.338f, 10.7192f, 17.625f, 11.3432f, 17.625f, 12.0f)
                curveTo(17.625f, 12.6569f, 17.338f, 13.2809f, 16.8393f, 13.7084f)
                lineTo(13.3393f, 16.7084f)
                curveTo(12.3958f, 17.5171f, 10.9754f, 17.4078f, 10.1667f, 16.4643f)
                curveTo(9.6241f, 15.8313f, 9.4947f, 14.9836f, 9.7533f, 14.25f)
                lineTo(9.375f, 14.25f)
                lineTo(9.375f, 16.0f)
                curveTo(9.375f, 18.8284f, 9.375f, 20.2426f, 10.2537f, 21.1213f)
                curveTo(11.1324f, 22.0f, 12.5466f, 22.0f, 15.375f, 22.0f)
                lineTo(16.375f, 22.0f)
                curveTo(19.2034f, 22.0f, 20.6176f, 22.0f, 21.4963f, 21.1213f)
                curveTo(22.375f, 20.2426f, 22.375f, 18.8284f, 22.375f, 16.0f)
                lineTo(22.375f, 8.0f)
                curveTo(22.375f, 5.1716f, 22.375f, 3.7574f, 21.4963f, 2.8787f)
                curveTo(20.6176f, 2.0f, 19.2034f, 2.0f, 16.375f, 2.0f)
                lineTo(15.375f, 2.0f)
                curveTo(12.5466f, 2.0f, 11.1324f, 2.0f, 10.2537f, 2.8787f)
                curveTo(9.375f, 3.7574f, 9.375f, 5.1716f, 9.375f, 8.0f)
                lineTo(9.375f, 9.75f)
                close()
            }
        }
            .build()
        return _login2!!
    }

private var _login2: ImageVector? = null
