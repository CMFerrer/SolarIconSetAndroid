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

public val MapLocationGroup.MapArrowDown: ImageVector
    get() {
        if (_mapArrowDown != null) {
            return _mapArrowDown!!
        }
        _mapArrowDown = Builder(name = "MapArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0471f, 1.9874f)
                curveTo(21.7007f, 2.672f, 21.9872f, 3.7551f, 21.52f, 4.8028f)
                lineTo(14.1575f, 21.3125f)
                curveTo(13.3029f, 23.229f, 10.6971f, 23.229f, 9.8425f, 21.3125f)
                lineTo(2.48f, 4.8028f)
                curveTo(2.0128f, 3.7551f, 2.2994f, 2.672f, 2.9529f, 1.9874f)
                curveTo(3.6119f, 1.2971f, 4.6882f, 0.9783f, 5.7201f, 1.5293f)
                lineTo(5.3669f, 2.1909f)
                lineTo(5.7201f, 1.5293f)
                lineTo(11.6238f, 4.6813f)
                lineTo(11.2706f, 5.3429f)
                lineTo(11.6238f, 4.6813f)
                curveTo(11.8623f, 4.8086f, 12.1377f, 4.8086f, 12.3762f, 4.6813f)
                lineTo(18.2799f, 1.5293f)
                lineTo(18.6331f, 2.1909f)
                lineTo(18.2799f, 1.5293f)
                curveTo(19.3118f, 0.9783f, 20.3881f, 1.2971f, 21.0471f, 1.9874f)
                close()
                moveTo(18.9863f, 2.8525f)
                lineTo(18.6357f, 2.1957f)
                lineTo(18.9863f, 2.8525f)
                lineTo(13.0826f, 6.0045f)
                curveTo(12.4027f, 6.3675f, 11.5973f, 6.3675f, 10.9174f, 6.0045f)
                lineTo(5.0137f, 2.8525f)
                curveTo(4.6579f, 2.6625f, 4.2996f, 2.749f, 4.0378f, 3.0232f)
                curveTo(3.7706f, 3.3032f, 3.6501f, 3.7437f, 3.8499f, 4.1919f)
                lineTo(11.2124f, 20.7016f)
                curveTo(11.5384f, 21.4327f, 12.4616f, 21.4327f, 12.7876f, 20.7016f)
                lineTo(20.1501f, 4.1919f)
                curveTo(20.3499f, 3.7437f, 20.2294f, 3.3032f, 19.9621f, 3.0232f)
                curveTo(19.7004f, 2.749f, 19.3421f, 2.6625f, 18.9863f, 2.8525f)
                close()
            }
        }
        .build()
        return _mapArrowDown!!
    }

private var _mapArrowDown: ImageVector? = null
