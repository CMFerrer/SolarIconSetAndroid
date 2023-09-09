package com.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.DesignToolsGroup

public val DesignToolsGroup.Filters: ImageVector
    get() {
        if (_filters != null) {
            return _filters!!
        }
        _filters = Builder(name = "Filters", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(9.1005f, 2.75f, 6.75f, 5.1005f, 6.75f, 8.0f)
                curveTo(6.75f, 10.8995f, 9.1005f, 13.25f, 12.0f, 13.25f)
                curveTo(14.8995f, 13.25f, 17.25f, 10.8995f, 17.25f, 8.0f)
                curveTo(17.25f, 5.1005f, 14.8995f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(5.25f, 8.0f)
                curveTo(5.25f, 4.2721f, 8.2721f, 1.25f, 12.0f, 1.25f)
                curveTo(15.7279f, 1.25f, 18.75f, 4.2721f, 18.75f, 8.0f)
                curveTo(18.75f, 8.6009f, 18.6715f, 9.1835f, 18.5241f, 9.738f)
                curveTo(21.0013f, 10.7375f, 22.75f, 13.1638f, 22.75f, 16.0f)
                curveTo(22.75f, 19.7279f, 19.7279f, 22.75f, 16.0f, 22.75f)
                curveTo(14.5034f, 22.75f, 13.1193f, 22.2622f, 12.0001f, 21.4377f)
                curveTo(10.8806f, 22.2625f, 9.4972f, 22.75f, 8.0f, 22.75f)
                curveTo(4.2721f, 22.75f, 1.25f, 19.7279f, 1.25f, 16.0f)
                curveTo(1.25f, 13.1638f, 2.9987f, 10.7375f, 5.4759f, 9.738f)
                curveTo(5.3285f, 9.1835f, 5.25f, 8.6009f, 5.25f, 8.0f)
                close()
                moveTo(6.0209f, 11.1356f)
                curveTo(4.1021f, 11.917f, 2.75f, 13.8014f, 2.75f, 16.0f)
                curveTo(2.75f, 18.8995f, 5.1005f, 21.25f, 8.0f, 21.25f)
                curveTo(10.8995f, 21.25f, 13.25f, 18.8995f, 13.25f, 16.0f)
                curveTo(13.25f, 15.5377f, 13.1904f, 15.0902f, 13.0787f, 14.6643f)
                curveTo(12.7275f, 14.7207f, 12.3672f, 14.75f, 12.0f, 14.75f)
                curveTo(9.4039f, 14.75f, 7.1502f, 13.2845f, 6.0209f, 11.1356f)
                close()
                moveTo(14.524f, 14.2623f)
                curveTo(14.6715f, 14.8173f, 14.75f, 15.3999f, 14.75f, 16.0f)
                curveTo(14.75f, 17.6778f, 14.1378f, 19.2127f, 13.1246f, 20.3934f)
                curveTo(13.9506f, 20.9353f, 14.938f, 21.25f, 16.0f, 21.25f)
                curveTo(18.8995f, 21.25f, 21.25f, 18.8995f, 21.25f, 16.0f)
                curveTo(21.25f, 13.8014f, 19.8979f, 11.917f, 17.9791f, 11.1356f)
                curveTo(17.238f, 12.5458f, 16.0126f, 13.6617f, 14.524f, 14.2623f)
                close()
            }
        }
        .build()
        return _filters!!
    }

private var _filters: ImageVector? = null
