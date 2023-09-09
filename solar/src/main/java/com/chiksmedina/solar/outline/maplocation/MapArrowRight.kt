package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

public val MapLocationGroup.MapArrowRight: ImageVector
    get() {
        if (_mapArrowRight != null) {
            return _mapArrowRight!!
        }
        _mapArrowRight = Builder(name = "MapArrowRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.9874f, 2.9532f)
                curveTo(2.672f, 2.2997f, 3.7551f, 2.0131f, 4.8028f, 2.4804f)
                lineTo(21.3125f, 9.8428f)
                curveTo(23.229f, 10.6975f, 23.229f, 13.3032f, 21.3125f, 14.1579f)
                lineTo(4.8028f, 21.5204f)
                curveTo(3.7551f, 21.9876f, 2.672f, 21.701f, 1.9874f, 21.0475f)
                curveTo(1.2971f, 20.3884f, 0.9783f, 19.3122f, 1.5293f, 18.2802f)
                lineTo(4.6813f, 12.3765f)
                lineTo(5.3429f, 12.7298f)
                lineTo(4.6813f, 12.3765f)
                curveTo(4.8086f, 12.1381f, 4.8086f, 11.8626f, 4.6813f, 11.6242f)
                lineTo(1.5293f, 5.7205f)
                curveTo(0.9783f, 4.6885f, 1.2971f, 3.6123f, 1.9874f, 2.9532f)
                close()
                moveTo(3.0232f, 4.0382f)
                curveTo(2.749f, 4.3f, 2.6625f, 4.6582f, 2.8525f, 5.014f)
                lineTo(2.1909f, 5.3672f)
                lineTo(2.8525f, 5.014f)
                lineTo(6.0045f, 10.9177f)
                curveTo(6.3675f, 11.5976f, 6.3675f, 12.4031f, 6.0045f, 13.083f)
                lineTo(2.8525f, 18.9867f)
                curveTo(2.6625f, 19.3425f, 2.749f, 19.7008f, 3.0232f, 19.9625f)
                curveTo(3.3032f, 20.2298f, 3.7437f, 20.3503f, 4.1919f, 20.1504f)
                lineTo(20.7016f, 12.7879f)
                curveTo(21.4326f, 12.4619f, 21.4327f, 11.5388f, 20.7016f, 11.2128f)
                lineTo(4.1919f, 3.8503f)
                curveTo(3.7437f, 3.6504f, 3.3032f, 3.771f, 3.0232f, 4.0382f)
                close()
            }
        }
        .build()
        return _mapArrowRight!!
    }

private var _mapArrowRight: ImageVector? = null
