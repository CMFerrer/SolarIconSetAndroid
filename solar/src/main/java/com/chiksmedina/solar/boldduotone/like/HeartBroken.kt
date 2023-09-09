package com.chiksmedina.solar.boldduotone.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.LikeGroup

public val LikeGroup.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) {
            return _heartBroken!!
        }
        _heartBroken = Builder(name = "HeartBroken", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0383f, 18.9111f)
                curveTo(17.9806f, 16.5917f, 22.0f, 14.0003f, 22.0f, 9.1373f)
                curveTo(22.0f, 4.2744f, 16.4998f, 0.8257f, 12.0f, 5.5009f)
                lineTo(10.8822f, 7.7359f)
                curveTo(10.6998f, 8.1007f, 10.6086f, 8.2831f, 10.6531f, 8.4622f)
                curveTo(10.6975f, 8.6413f, 10.8635f, 8.7599f, 11.1954f, 8.997f)
                lineTo(13.111f, 10.3652f)
                curveTo(13.5268f, 10.6622f, 13.7346f, 10.8107f, 13.7612f, 11.0293f)
                curveTo(13.7878f, 11.2478f, 13.6215f, 11.4418f, 13.289f, 11.8298f)
                lineTo(11.6027f, 13.7971f)
                curveTo(11.3168f, 14.1307f, 11.1738f, 14.2975f, 11.1813f, 14.4933f)
                curveTo(11.1888f, 14.6891f, 11.3442f, 14.8444f, 11.6548f, 15.155f)
                lineTo(12.5996f, 16.0999f)
                curveTo(12.7952f, 16.2954f, 12.893f, 16.3932f, 12.9281f, 16.5202f)
                curveTo(12.9633f, 16.6471f, 12.9298f, 16.7812f, 12.8627f, 17.0495f)
                lineTo(12.0f, 20.5002f)
                curveTo(13.0f, 20.5002f, 14.0f, 19.7296f, 15.0383f, 18.9111f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.1063f, 18.2471f)
                curveTo(5.2982f, 16.0836f, 2.0f, 13.5424f, 2.0f, 9.1373f)
                curveTo(2.0f, 4.2744f, 7.5002f, 0.8257f, 12.0f, 5.5009f)
                lineTo(10.8822f, 7.7359f)
                curveTo(10.6998f, 8.1007f, 10.6086f, 8.2831f, 10.6531f, 8.4622f)
                curveTo(10.6975f, 8.6413f, 10.8635f, 8.7599f, 11.1954f, 8.997f)
                lineTo(13.111f, 10.3652f)
                curveTo(13.5268f, 10.6622f, 13.7346f, 10.8107f, 13.7612f, 11.0293f)
                curveTo(13.7878f, 11.2478f, 13.6215f, 11.4418f, 13.289f, 11.8297f)
                lineTo(11.6027f, 13.7971f)
                curveTo(11.3168f, 14.1307f, 11.1738f, 14.2975f, 11.1813f, 14.4933f)
                curveTo(11.1888f, 14.6891f, 11.3442f, 14.8444f, 11.6548f, 15.155f)
                lineTo(12.5996f, 16.0999f)
                curveTo(12.7952f, 16.2954f, 12.893f, 16.3932f, 12.9281f, 16.5202f)
                curveTo(12.9633f, 16.6471f, 12.9298f, 16.7812f, 12.8627f, 17.0495f)
                lineTo(12.0f, 20.5002f)
                curveTo(11.0f, 20.5002f, 10.0f, 19.7296f, 8.9617f, 18.9111f)
                curveTo(8.6847f, 18.6927f, 8.3981f, 18.4719f, 8.1063f, 18.2471f)
                close()
            }
        }
        .build()
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
