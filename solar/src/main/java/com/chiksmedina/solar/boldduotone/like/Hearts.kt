package com.chiksmedina.solar.boldduotone.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.LikeGroup

val LikeGroup.Hearts: ImageVector
    get() {
        if (_hearts != null) {
            return _hearts!!
        }
        _hearts = Builder(
            name = "Hearts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 9.1373f)
                curveTo(2.0f, 14.0003f, 6.0194f, 16.5917f, 8.9617f, 18.9111f)
                curveTo(10.0f, 19.7296f, 11.0f, 20.5002f, 12.0f, 20.5002f)
                curveTo(13.0f, 20.5002f, 14.0f, 19.7296f, 15.0383f, 18.9111f)
                curveTo(17.9806f, 16.5917f, 22.0f, 14.0003f, 22.0f, 9.1373f)
                curveTo(22.0f, 4.2744f, 16.4998f, 0.8257f, 12.0f, 5.5009f)
                curveTo(7.5002f, 0.8257f, 2.0f, 4.2744f, 2.0f, 9.1373f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
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
        }
            .build()
        return _hearts!!
    }

private var _hearts: ImageVector? = null
