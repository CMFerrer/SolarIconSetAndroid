package com.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.EssentionalUiGroup

public val EssentionalUiGroup.PaperBin: ImageVector
    get() {
        if (_paperBin != null) {
            return _paperBin!!
        }
        _paperBin = Builder(name = "PaperBin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0335f, 8.89f)
                curveTo(2.553f, 5.6865f, 2.3127f, 4.0847f, 3.2104f, 3.0423f)
                curveTo(4.108f, 2.0f, 5.7277f, 2.0f, 8.9671f, 2.0f)
                horizontalLineTo(15.0329f)
                curveTo(18.2723f, 2.0f, 19.892f, 2.0f, 20.7897f, 3.0423f)
                curveTo(21.6873f, 4.0847f, 21.4471f, 5.6865f, 20.9665f, 8.89f)
                lineTo(19.7665f, 16.89f)
                curveTo(19.4009f, 19.3276f, 19.2181f, 20.5464f, 18.3741f, 21.2732f)
                curveTo(17.5302f, 22.0f, 16.2978f, 22.0f, 13.8329f, 22.0f)
                horizontalLineTo(10.1671f)
                curveTo(7.7023f, 22.0f, 6.4698f, 22.0f, 5.6259f, 21.2732f)
                curveTo(4.782f, 20.5464f, 4.5992f, 19.3276f, 4.2335f, 16.89f)
                lineTo(3.0335f, 8.89f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 6.0f)
                lineTo(3.5f, 11.0f)
                lineTo(11.0f, 19.0f)
                moveTo(14.0f, 6.0f)
                lineTo(4.0f, 16.0f)
                moveTo(20.0f, 6.0f)
                lineTo(7.0f, 19.0f)
                moveTo(13.0f, 19.0f)
                lineTo(20.5f, 11.0f)
                lineTo(16.0f, 6.0f)
                moveTo(10.0f, 6.0f)
                lineTo(20.0f, 16.0f)
                moveTo(4.0f, 6.0f)
                lineTo(17.0f, 19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineTo(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
            }
        }
        .build()
        return _paperBin!!
    }

private var _paperBin: ImageVector? = null
