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

val EssentionalUiGroup.HomeSmile: ImageVector
    get() {
        if (_homeSmile != null) {
            return _homeSmile!!
        }
        _homeSmile = Builder(
            name = "HomeSmile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.5192f, 7.8227f)
                curveTo(2.0f, 8.7713f, 2.0f, 9.9155f, 2.0f, 12.2039f)
                verticalLineTo(13.725f)
                curveTo(2.0f, 17.6258f, 2.0f, 19.5763f, 3.1716f, 20.7881f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.7881f)
                curveTo(22.0f, 19.5763f, 22.0f, 17.6258f, 22.0f, 13.725f)
                verticalLineTo(12.2039f)
                curveTo(22.0f, 9.9155f, 22.0f, 8.7713f, 21.4808f, 7.8227f)
                curveTo(20.9616f, 6.8742f, 20.0131f, 6.2855f, 18.116f, 5.1081f)
                lineTo(16.116f, 3.8669f)
                curveTo(14.1106f, 2.6223f, 13.1079f, 2.0f, 12.0f, 2.0f)
                curveTo(10.8921f, 2.0f, 9.8894f, 2.6223f, 7.884f, 3.8669f)
                lineTo(5.884f, 5.1081f)
                curveTo(3.9869f, 6.2855f, 3.0384f, 6.8742f, 2.5192f, 7.8227f)
                close()
                moveTo(9.4466f, 15.3975f)
                curveTo(9.1138f, 15.1508f, 8.6441f, 15.2206f, 8.3975f, 15.5534f)
                curveTo(8.1508f, 15.8862f, 8.2206f, 16.3559f, 8.5534f, 16.6025f)
                curveTo(9.5258f, 17.3233f, 10.715f, 17.75f, 12.0f, 17.75f)
                curveTo(13.285f, 17.75f, 14.4742f, 17.3233f, 15.4466f, 16.6025f)
                curveTo(15.7794f, 16.3559f, 15.8492f, 15.8862f, 15.6025f, 15.5534f)
                curveTo(15.3559f, 15.2206f, 14.8862f, 15.1508f, 14.5534f, 15.3975f)
                curveTo(13.825f, 15.9373f, 12.9459f, 16.25f, 12.0f, 16.25f)
                curveTo(11.0541f, 16.25f, 10.175f, 15.9373f, 9.4466f, 15.3975f)
                close()
            }
        }
            .build()
        return _homeSmile!!
    }

private var _homeSmile: ImageVector? = null
