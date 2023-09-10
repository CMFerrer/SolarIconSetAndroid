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

val MapLocationGroup.MapArrowLeft: ImageVector
    get() {
        if (_mapArrowLeft != null) {
            return _mapArrowLeft!!
        }
        _mapArrowLeft = Builder(
            name = "MapArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0126f, 2.9532f)
                curveTo(21.328f, 2.2997f, 20.2449f, 2.0131f, 19.1972f, 2.4804f)
                lineTo(2.6875f, 9.8428f)
                curveTo(0.771f, 10.6975f, 0.771f, 13.3032f, 2.6875f, 14.1579f)
                lineTo(19.1972f, 21.5204f)
                curveTo(20.2449f, 21.9876f, 21.328f, 21.701f, 22.0126f, 21.0475f)
                curveTo(22.7029f, 20.3884f, 23.0217f, 19.3122f, 22.4707f, 18.2802f)
                lineTo(19.3187f, 12.3765f)
                lineTo(18.6571f, 12.7298f)
                lineTo(19.3187f, 12.3765f)
                curveTo(19.1914f, 12.1381f, 19.1914f, 11.8626f, 19.3187f, 11.6242f)
                lineTo(22.4707f, 5.7205f)
                curveTo(23.0217f, 4.6885f, 22.7029f, 3.6123f, 22.0126f, 2.9532f)
                close()
                moveTo(20.9768f, 4.0382f)
                curveTo(21.2509f, 4.3f, 21.3375f, 4.6582f, 21.1475f, 5.014f)
                lineTo(21.8091f, 5.3672f)
                lineTo(21.1475f, 5.014f)
                lineTo(17.9955f, 10.9177f)
                curveTo(17.6325f, 11.5976f, 17.6325f, 12.4031f, 17.9955f, 13.083f)
                lineTo(21.1475f, 18.9867f)
                curveTo(21.3375f, 19.3425f, 21.2509f, 19.7008f, 20.9768f, 19.9625f)
                curveTo(20.6968f, 20.2298f, 20.2563f, 20.3503f, 19.8081f, 20.1504f)
                lineTo(3.2984f, 12.7879f)
                curveTo(2.5673f, 12.4619f, 2.5673f, 11.5388f, 3.2984f, 11.2128f)
                lineTo(19.8081f, 3.8503f)
                curveTo(20.2563f, 3.6504f, 20.6968f, 3.771f, 20.9768f, 4.0382f)
                close()
            }
        }
            .build()
        return _mapArrowLeft!!
    }

private var _mapArrowLeft: ImageVector? = null
