package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(
            name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.803f, 5.3333f)
                curveTo(13.803f, 3.4924f, 15.3022f, 2.0f, 17.1515f, 2.0f)
                curveTo(19.0008f, 2.0f, 20.5f, 3.4924f, 20.5f, 5.3333f)
                curveTo(20.5f, 7.1743f, 19.0008f, 8.6667f, 17.1515f, 8.6667f)
                curveTo(16.2177f, 8.6667f, 15.3738f, 8.286f, 14.7671f, 7.6735f)
                lineTo(10.1317f, 10.8295f)
                curveTo(10.1745f, 11.0425f, 10.197f, 11.2625f, 10.197f, 11.4872f)
                curveTo(10.197f, 11.9322f, 10.109f, 12.3576f, 9.9496f, 12.7464f)
                lineTo(15.0323f, 16.0858f)
                curveTo(15.6092f, 15.6161f, 16.3473f, 15.3333f, 17.1515f, 15.3333f)
                curveTo(19.0008f, 15.3333f, 20.5f, 16.8257f, 20.5f, 18.6667f)
                curveTo(20.5f, 20.5076f, 19.0008f, 22.0f, 17.1515f, 22.0f)
                curveTo(15.3022f, 22.0f, 13.803f, 20.5076f, 13.803f, 18.6667f)
                curveTo(13.803f, 18.1845f, 13.9062f, 17.7255f, 14.0917f, 17.3111f)
                lineTo(9.0501f, 13.9987f)
                curveTo(8.462f, 14.5098f, 7.6916f, 14.8205f, 6.8485f, 14.8205f)
                curveTo(4.9992f, 14.8205f, 3.5f, 13.3281f, 3.5f, 11.4872f)
                curveTo(3.5f, 9.6462f, 4.9992f, 8.1538f, 6.8485f, 8.1538f)
                curveTo(7.9119f, 8.1538f, 8.8585f, 8.6473f, 9.4714f, 9.4152f)
                lineTo(13.9639f, 6.3564f)
                curveTo(13.8594f, 6.0336f, 13.803f, 5.6896f, 13.803f, 5.3333f)
                close()
            }
        }
            .build()
        return _share!!
    }

private var _share: ImageVector? = null
