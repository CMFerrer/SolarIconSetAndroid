package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

public val SportsGroup.Stretching: ImageVector
    get() {
        if (_stretching != null) {
            return _stretching!!
        }
        _stretching = Builder(name = "Stretching", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.5f, 2.75f)
                curveTo(13.5335f, 2.75f, 12.75f, 3.5335f, 12.75f, 4.5f)
                curveTo(12.75f, 5.4665f, 13.5335f, 6.25f, 14.5f, 6.25f)
                curveTo(15.4665f, 6.25f, 16.25f, 5.4665f, 16.25f, 4.5f)
                curveTo(16.25f, 3.5335f, 15.4665f, 2.75f, 14.5f, 2.75f)
                close()
                moveTo(11.25f, 4.5f)
                curveTo(11.25f, 2.7051f, 12.7051f, 1.25f, 14.5f, 1.25f)
                curveTo(16.2949f, 1.25f, 17.75f, 2.7051f, 17.75f, 4.5f)
                curveTo(17.75f, 6.2949f, 16.2949f, 7.75f, 14.5f, 7.75f)
                curveTo(12.7051f, 7.75f, 11.25f, 6.2949f, 11.25f, 4.5f)
                close()
                moveTo(10.5026f, 9.2067f)
                curveTo(11.9873f, 8.5704f, 13.6389f, 9.6595f, 13.6389f, 11.2748f)
                verticalLineTo(13.8953f)
                curveTo(13.6389f, 14.3654f, 13.5184f, 14.8276f, 13.2889f, 15.2379f)
                lineTo(10.5766f, 20.0861f)
                curveTo(10.2517f, 20.6668f, 9.7273f, 21.11f, 9.1005f, 21.3336f)
                lineTo(5.252f, 22.7064f)
                curveTo(4.8618f, 22.8456f, 4.4328f, 22.6421f, 4.2936f, 22.252f)
                curveTo(4.1544f, 21.8618f, 4.3579f, 21.4328f, 4.748f, 21.2936f)
                lineTo(8.5966f, 19.9208f)
                curveTo(8.8815f, 19.8192f, 9.1198f, 19.6177f, 9.2675f, 19.3537f)
                lineTo(11.9798f, 14.5055f)
                curveTo(12.0841f, 14.3191f, 12.1389f, 14.1089f, 12.1389f, 13.8953f)
                verticalLineTo(11.2748f)
                curveTo(12.1389f, 10.7364f, 11.5884f, 10.3733f, 11.0935f, 10.5854f)
                lineTo(8.6377f, 11.6379f)
                curveTo(8.1462f, 11.8485f, 8.0267f, 12.491f, 8.4095f, 12.8643f)
                lineTo(9.0236f, 13.463f)
                curveTo(9.3202f, 13.7522f, 9.3262f, 14.227f, 9.037f, 14.5236f)
                curveTo(8.7478f, 14.8202f, 8.273f, 14.8262f, 7.9764f, 14.537f)
                lineTo(7.3624f, 13.9383f)
                curveTo(6.2139f, 12.8186f, 6.5725f, 10.8911f, 8.0468f, 10.2592f)
                lineTo(10.5026f, 9.2067f)
                close()
                moveTo(16.5589f, 14.0535f)
                curveTo(18.2318f, 13.7817f, 19.75f, 15.0731f, 19.75f, 16.7679f)
                verticalLineTo(22.0f)
                curveTo(19.75f, 22.4142f, 19.4142f, 22.75f, 19.0f, 22.75f)
                curveTo(18.5858f, 22.75f, 18.25f, 22.4142f, 18.25f, 22.0f)
                verticalLineTo(16.7679f)
                curveTo(18.25f, 15.9975f, 17.5599f, 15.4105f, 16.7995f, 15.5341f)
                lineTo(15.787f, 15.6986f)
                curveTo(15.3781f, 15.7651f, 14.9928f, 15.4875f, 14.9264f, 15.0786f)
                curveTo(14.8599f, 14.6698f, 15.1375f, 14.2845f, 15.5464f, 14.218f)
                lineTo(16.5589f, 14.0535f)
                close()
            }
        }
        .build()
        return _stretching!!
    }

private var _stretching: ImageVector? = null
