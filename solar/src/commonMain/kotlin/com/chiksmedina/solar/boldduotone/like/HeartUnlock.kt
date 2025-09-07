package com.chiksmedina.solar.boldduotone.like

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
import com.chiksmedina.solar.boldduotone.LikeGroup

val LikeGroup.HeartUnlock: ImageVector
    get() {
        if (_heartUnlock != null) {
            return _heartUnlock!!
        }
        _heartUnlock = Builder(
            name = "HeartUnlock", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5012f, 7.014f)
                curveTo(7.6653f, 6.0171f, 8.055f, 5.2748f, 8.5939f, 4.7448f)
                curveTo(9.3329f, 4.0179f, 10.4444f, 3.6f, 11.896f, 3.6f)
                curveTo(13.7289f, 3.6f, 15.0149f, 4.2613f, 15.7123f, 5.3912f)
                curveTo(15.9359f, 5.7535f, 16.3769f, 5.8422f, 16.6974f, 5.5894f)
                curveTo(17.0178f, 5.3365f, 17.0963f, 4.8378f, 16.8727f, 4.4755f)
                curveTo(15.821f, 2.7715f, 14.0086f, 2.0f, 11.896f, 2.0f)
                curveTo(10.2215f, 2.0f, 8.7389f, 2.4815f, 7.6652f, 3.5376f)
                curveTo(6.7208f, 4.4665f, 6.1618f, 5.7721f, 6.0303f, 7.377f)
                curveTo(6.4906f, 7.1795f, 6.9853f, 7.0541f, 7.5012f, 7.014f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(8.4957f, 20.0367f)
                curveTo(5.9684f, 18.1516f, 3.0f, 15.9375f, 3.0f, 12.0992f)
                curveTo(3.0f, 7.862f, 7.9501f, 4.857f, 12.0f, 8.9306f)
                curveTo(16.0499f, 4.857f, 21.0f, 7.862f, 21.0f, 12.0992f)
                curveTo(21.0f, 15.9375f, 18.0316f, 18.1516f, 15.5044f, 20.0367f)
                curveTo(15.2417f, 20.2327f, 14.9838f, 20.4251f, 14.7344f, 20.6154f)
                curveTo(13.8f, 21.3285f, 12.9f, 22.0f, 12.0f, 22.0f)
                curveTo(11.1f, 22.0f, 10.2f, 21.3285f, 9.2656f, 20.6154f)
                curveTo(9.0162f, 20.4251f, 8.7583f, 20.2327f, 8.4957f, 20.0367f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 11.25f)
                curveTo(12.4142f, 11.25f, 12.75f, 11.5858f, 12.75f, 12.0f)
                verticalLineTo(14.5f)
                curveTo(12.75f, 14.9142f, 12.4142f, 15.25f, 12.0f, 15.25f)
                curveTo(11.5858f, 15.25f, 11.25f, 14.9142f, 11.25f, 14.5f)
                verticalLineTo(12.0f)
                curveTo(11.25f, 11.5858f, 11.5858f, 11.25f, 12.0f, 11.25f)
                close()
            }
        }
            .build()
        return _heartUnlock!!
    }

private var _heartUnlock: ImageVector? = null
