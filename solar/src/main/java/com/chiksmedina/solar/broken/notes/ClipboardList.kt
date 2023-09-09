package com.chiksmedina.solar.broken.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.NotesGroup

public val NotesGroup.ClipboardList: ImageVector
    get() {
        if (_clipboardList != null) {
            return _clipboardList!!
        }
        _clipboardList = Builder(name = "ClipboardList", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 14.0f)
                lineTo(17.0f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                horizontalLineTo(7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 10.5f)
                horizontalLineTo(7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 17.5f)
                horizontalLineTo(7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 10.5f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 17.5f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 3.5f)
                curveTo(8.0f, 2.6716f, 8.6716f, 2.0f, 9.5f, 2.0f)
                horizontalLineTo(14.5f)
                curveTo(15.3284f, 2.0f, 16.0f, 2.6716f, 16.0f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(16.0f, 5.3284f, 15.3284f, 6.0f, 14.5f, 6.0f)
                horizontalLineTo(9.5f)
                curveTo(8.6716f, 6.0f, 8.0f, 5.3284f, 8.0f, 4.5f)
                verticalLineTo(3.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 16.0002f)
                curveTo(21.0f, 18.8286f, 21.0f, 20.2429f, 20.1213f, 21.1215f)
                curveTo(19.2426f, 22.0002f, 17.8284f, 22.0002f, 15.0f, 22.0002f)
                horizontalLineTo(9.0f)
                curveTo(6.1716f, 22.0002f, 4.7574f, 22.0002f, 3.8787f, 21.1215f)
                curveTo(3.0f, 20.2429f, 3.0f, 18.8286f, 3.0f, 16.0002f)
                verticalLineTo(13.0002f)
                moveTo(16.0f, 4.0019f)
                curveTo(18.175f, 4.0141f, 19.3529f, 4.1105f, 20.1213f, 4.8789f)
                curveTo(21.0f, 5.7576f, 21.0f, 7.1718f, 21.0f, 10.0002f)
                verticalLineTo(12.0002f)
                moveTo(8.0f, 4.0019f)
                curveTo(5.825f, 4.0141f, 4.6471f, 4.1105f, 3.8787f, 4.8789f)
                curveTo(3.1103f, 5.6473f, 3.0138f, 6.8251f, 3.0017f, 9.0f)
            }
        }
        .build()
        return _clipboardList!!
    }

private var _clipboardList: ImageVector? = null
