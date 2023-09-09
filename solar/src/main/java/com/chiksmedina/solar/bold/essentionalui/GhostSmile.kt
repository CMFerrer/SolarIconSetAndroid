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

public val EssentionalUiGroup.GhostSmile: ImageVector
    get() {
        if (_ghostSmile != null) {
            return _ghostSmile!!
        }
        _ghostSmile = Builder(name = "GhostSmile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                verticalLineTo(19.2058f)
                curveTo(22.0f, 20.4896f, 20.649f, 21.3245f, 19.5008f, 20.7504f)
                curveTo(18.5727f, 20.2864f, 17.4672f, 20.3552f, 16.6039f, 20.9308f)
                curveTo(15.6326f, 21.5782f, 14.3674f, 21.5782f, 13.3961f, 20.9308f)
                lineTo(13.0435f, 20.6957f)
                curveTo(12.4116f, 20.2744f, 11.5884f, 20.2744f, 10.9565f, 20.6957f)
                lineTo(10.6039f, 20.9308f)
                curveTo(9.6326f, 21.5782f, 8.3674f, 21.5782f, 7.3961f, 20.9308f)
                curveTo(6.5328f, 20.3552f, 5.4273f, 20.2864f, 4.4992f, 20.7504f)
                curveTo(3.351f, 21.3245f, 2.0f, 20.4896f, 2.0f, 19.2058f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(9.4466f, 14.3975f)
                curveTo(9.1138f, 14.1508f, 8.6441f, 14.2206f, 8.3975f, 14.5534f)
                curveTo(8.1508f, 14.8862f, 8.2206f, 15.3559f, 8.5534f, 15.6025f)
                curveTo(9.5258f, 16.3233f, 10.715f, 16.75f, 12.0f, 16.75f)
                curveTo(13.285f, 16.75f, 14.4742f, 16.3233f, 15.4466f, 15.6025f)
                curveTo(15.7794f, 15.3559f, 15.8492f, 14.8862f, 15.6025f, 14.5534f)
                curveTo(15.3559f, 14.2206f, 14.8862f, 14.1508f, 14.5534f, 14.3975f)
                curveTo(13.825f, 14.9373f, 12.9459f, 15.25f, 12.0f, 15.25f)
                curveTo(11.0541f, 15.25f, 10.175f, 14.9373f, 9.4466f, 14.3975f)
                close()
                moveTo(16.0f, 9.5f)
                curveTo(16.0f, 10.3284f, 15.5523f, 11.0f, 15.0f, 11.0f)
                curveTo(14.4477f, 11.0f, 14.0f, 10.3284f, 14.0f, 9.5f)
                curveTo(14.0f, 8.6716f, 14.4477f, 8.0f, 15.0f, 8.0f)
                curveTo(15.5523f, 8.0f, 16.0f, 8.6716f, 16.0f, 9.5f)
                close()
                moveTo(9.0f, 11.0f)
                curveTo(9.5523f, 11.0f, 10.0f, 10.3284f, 10.0f, 9.5f)
                curveTo(10.0f, 8.6716f, 9.5523f, 8.0f, 9.0f, 8.0f)
                curveTo(8.4477f, 8.0f, 8.0f, 8.6716f, 8.0f, 9.5f)
                curveTo(8.0f, 10.3284f, 8.4477f, 11.0f, 9.0f, 11.0f)
                close()
            }
        }
        .build()
        return _ghostSmile!!
    }

private var _ghostSmile: ImageVector? = null
