package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.HomeWifi: ImageVector
    get() {
        if (_homeWifi != null) {
            return _homeWifi!!
        }
        _homeWifi = Builder(
            name = "HomeWifi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.7881f)
                curveTo(2.0f, 19.5763f, 2.0f, 17.6258f, 2.0f, 13.725f)
                verticalLineTo(12.2039f)
                curveTo(2.0f, 9.9155f, 2.0f, 8.7713f, 2.5192f, 7.8227f)
                curveTo(3.0384f, 6.8742f, 3.9869f, 6.2855f, 5.884f, 5.1081f)
                lineTo(7.884f, 3.8669f)
                curveTo(9.8894f, 2.6223f, 10.8921f, 2.0f, 12.0f, 2.0f)
                curveTo(13.1079f, 2.0f, 14.1106f, 2.6223f, 16.116f, 3.8669f)
                lineTo(18.116f, 5.1081f)
                curveTo(20.0131f, 6.2855f, 20.9616f, 6.8742f, 21.4808f, 7.8227f)
                curveTo(22.0f, 8.7713f, 22.0f, 9.9155f, 22.0f, 12.2039f)
                verticalLineTo(13.725f)
                curveTo(22.0f, 17.6258f, 22.0f, 19.5763f, 20.8284f, 20.7881f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                close()
                moveTo(17.4498f, 12.192f)
                curveTo(14.4329f, 8.9357f, 9.5671f, 8.9357f, 6.5502f, 12.192f)
                curveTo(6.2687f, 12.4959f, 5.7941f, 12.514f, 5.4903f, 12.2325f)
                curveTo(5.1864f, 11.951f, 5.1683f, 11.4764f, 5.4498f, 11.1726f)
                curveTo(9.0604f, 7.2755f, 14.9396f, 7.2755f, 18.5502f, 11.1726f)
                curveTo(18.8317f, 11.4764f, 18.8136f, 11.951f, 18.5097f, 12.2325f)
                curveTo(18.2059f, 12.514f, 17.7313f, 12.4959f, 17.4498f, 12.192f)
                close()
                moveTo(15.4498f, 14.3505f)
                curveTo(13.5375f, 12.2864f, 10.4625f, 12.2864f, 8.5502f, 14.3505f)
                curveTo(8.2687f, 14.6544f, 7.7941f, 14.6725f, 7.4903f, 14.391f)
                curveTo(7.1865f, 14.1095f, 7.1683f, 13.6349f, 7.4499f, 13.3311f)
                curveTo(9.9558f, 10.6262f, 14.0442f, 10.6262f, 16.5502f, 13.3311f)
                curveTo(16.8317f, 13.6349f, 16.8136f, 14.1095f, 16.5097f, 14.391f)
                curveTo(16.2059f, 14.6725f, 15.7314f, 14.6544f, 15.4498f, 14.3505f)
                close()
                moveTo(13.4499f, 16.5095f)
                curveTo(12.6421f, 15.6377f, 11.358f, 15.6377f, 10.5502f, 16.5095f)
                curveTo(10.2687f, 16.8134f, 9.7942f, 16.8315f, 9.4903f, 16.55f)
                curveTo(9.1865f, 16.2684f, 9.1684f, 15.7939f, 9.4499f, 15.4901f)
                curveTo(10.8513f, 13.9775f, 13.1488f, 13.9775f, 14.5502f, 15.4901f)
                curveTo(14.8317f, 15.7939f, 14.8136f, 16.2684f, 14.5098f, 16.55f)
                curveTo(14.2059f, 16.8315f, 13.7314f, 16.8134f, 13.4499f, 16.5095f)
                close()
            }
        }
            .build()
        return _homeWifi!!
    }

private var _homeWifi: ImageVector? = null
