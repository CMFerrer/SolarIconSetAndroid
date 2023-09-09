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

public val MapLocationGroup.MapArrowUp: ImageVector
    get() {
        if (_mapArrowUp != null) {
            return _mapArrowUp!!
        }
        _mapArrowUp = Builder(name = "MapArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0471f, 22.0126f)
                curveTo(21.7007f, 21.328f, 21.9872f, 20.2449f, 21.52f, 19.1972f)
                lineTo(14.1575f, 2.6875f)
                curveTo(13.3029f, 0.771f, 10.6971f, 0.771f, 9.8425f, 2.6875f)
                lineTo(2.48f, 19.1972f)
                curveTo(2.0128f, 20.2449f, 2.2994f, 21.328f, 2.9529f, 22.0126f)
                curveTo(3.6119f, 22.7029f, 4.6882f, 23.0217f, 5.7201f, 22.4707f)
                lineTo(5.3669f, 21.8091f)
                lineTo(5.7201f, 22.4707f)
                lineTo(11.6238f, 19.3187f)
                lineTo(11.2706f, 18.6571f)
                lineTo(11.6238f, 19.3187f)
                curveTo(11.8623f, 19.1914f, 12.1377f, 19.1914f, 12.3762f, 19.3187f)
                lineTo(18.2799f, 22.4707f)
                lineTo(18.6331f, 21.8091f)
                lineTo(18.2799f, 22.4707f)
                curveTo(19.3118f, 23.0217f, 20.3881f, 22.7029f, 21.0471f, 22.0126f)
                close()
                moveTo(18.9863f, 21.1475f)
                lineTo(18.6357f, 21.8043f)
                lineTo(18.9863f, 21.1475f)
                lineTo(13.0826f, 17.9955f)
                curveTo(12.4027f, 17.6325f, 11.5973f, 17.6325f, 10.9174f, 17.9955f)
                lineTo(5.0137f, 21.1475f)
                curveTo(4.6579f, 21.3375f, 4.2996f, 21.2509f, 4.0378f, 20.9768f)
                curveTo(3.7706f, 20.6968f, 3.6501f, 20.2563f, 3.8499f, 19.8081f)
                lineTo(11.2124f, 3.2984f)
                curveTo(11.5384f, 2.5673f, 12.4616f, 2.5673f, 12.7876f, 3.2984f)
                lineTo(20.1501f, 19.8081f)
                curveTo(20.3499f, 20.2563f, 20.2294f, 20.6968f, 19.9621f, 20.9768f)
                curveTo(19.7004f, 21.2509f, 19.3421f, 21.3375f, 18.9863f, 21.1475f)
                close()
            }
        }
        .build()
        return _mapArrowUp!!
    }

private var _mapArrowUp: ImageVector? = null
