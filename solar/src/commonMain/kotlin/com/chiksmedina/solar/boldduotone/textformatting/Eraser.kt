package com.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.TextFormattingGroup

val TextFormattingGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(
            name = "Eraser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.9522f, 3.0f)
                curveTo(13.9146f, 3.0f, 13.0796f, 3.835f, 11.4096f, 5.5051f)
                lineTo(6.5f, 10.4146f)
                lineTo(13.5854f, 17.5f)
                lineTo(18.4949f, 12.5904f)
                curveTo(20.165f, 10.9204f, 21.0f, 10.0854f, 21.0f, 9.0478f)
                curveTo(21.0f, 8.0101f, 20.165f, 7.1751f, 18.4949f, 5.5051f)
                curveTo(16.8249f, 3.835f, 15.9899f, 3.0f, 14.9522f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.5854f, 17.4999f)
                lineTo(6.5f, 10.4146f)
                lineTo(5.5051f, 11.4095f)
                curveTo(3.835f, 13.0795f, 3.0f, 13.9146f, 3.0f, 14.9522f)
                curveTo(3.0f, 15.9898f, 3.835f, 16.8248f, 5.5051f, 18.4949f)
                curveTo(7.1751f, 20.1649f, 8.0101f, 20.9999f, 9.0478f, 20.9999f)
                curveTo(10.0854f, 20.9999f, 10.9204f, 20.1649f, 12.5904f, 18.4949f)
                lineTo(13.5854f, 17.4999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0326f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0109f, 21.0003f, 9.0217f, 20.9999f, 9.0326f, 21.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0629f, 21.0f)
                curveTo(9.8593f, 20.9938f, 10.5389f, 20.4938f, 11.5734f, 19.5f)
                lineTo(21.0f, 19.5f)
                curveTo(21.4142f, 19.5f, 21.75f, 19.8358f, 21.75f, 20.25f)
                curveTo(21.75f, 20.6642f, 21.4142f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(9.0629f)
                close()
            }
        }
            .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
