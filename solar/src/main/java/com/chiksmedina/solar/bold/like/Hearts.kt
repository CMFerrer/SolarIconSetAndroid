package com.chiksmedina.solar.bold.like

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
import com.chiksmedina.solar.bold.LikeGroup

public val LikeGroup.Hearts: ImageVector
    get() {
        if (_hearts != null) {
            return _hearts!!
        }
        _hearts = Builder(name = "Hearts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 13.2871f)
                curveTo(14.0251f, 10.5713f, 11.0f, 12.5746f, 11.0f, 15.3995f)
                curveTo(11.0f, 17.9583f, 12.814f, 19.4344f, 14.3584f, 20.6912f)
                lineTo(14.4018f, 20.7265f)
                curveTo(14.5474f, 20.8449f, 14.6903f, 20.9615f, 14.829f, 21.0769f)
                curveTo(15.4f, 21.5523f, 15.95f, 22.0f, 16.5f, 22.0f)
                curveTo(17.05f, 22.0f, 17.6f, 21.5523f, 18.171f, 21.0769f)
                curveTo(19.7893f, 19.7296f, 22.0f, 18.2243f, 22.0f, 15.3995f)
                curveTo(22.0f, 14.4715f, 21.6735f, 13.6321f, 21.1474f, 13.0197f)
                curveTo(20.0718f, 11.7677f, 18.1619f, 11.4635f, 16.5f, 13.2871f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1063f, 18.2471f)
                curveTo(5.2982f, 16.0836f, 2.0f, 13.5424f, 2.0f, 9.1373f)
                curveTo(2.0f, 4.2744f, 7.5002f, 0.8257f, 12.0f, 5.5009f)
                curveTo(16.4998f, 0.8257f, 22.0f, 4.2744f, 22.0f, 9.1373f)
                curveTo(22.0f, 9.9709f, 21.8819f, 10.7377f, 21.6714f, 11.4479f)
                curveTo(20.9524f, 10.8704f, 20.051f, 10.5059f, 19.052f, 10.5003f)
                curveTo(18.162f, 10.4953f, 17.2936f, 10.7747f, 16.4988f, 11.3103f)
                curveTo(15.1099f, 10.3775f, 13.5429f, 10.252f, 12.1698f, 10.9149f)
                curveTo(10.5345f, 11.7044f, 9.5f, 13.4707f, 9.5f, 15.3997f)
                curveTo(9.5f, 17.7049f, 10.6485f, 19.3219f, 11.8415f, 20.4939f)
                curveTo(10.8942f, 20.4187f, 9.9451f, 19.6864f, 8.9617f, 18.9111f)
                curveTo(8.6847f, 18.6927f, 8.3981f, 18.4719f, 8.1063f, 18.2471f)
                close()
            }
        }
        .build()
        return _hearts!!
    }

private var _hearts: ImageVector? = null
