package com.chiksmedina.solar.broken.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.NotesGroup

public val NotesGroup.ArchiveUpMinimlistic: ImageVector
    get() {
        if (_archiveUpMinimlistic != null) {
            return _archiveUpMinimlistic!!
        }
        _archiveUpMinimlistic = Builder(name = "ArchiveUpMinimlistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 11.9997f)
                curveTo(2.0f, 7.2856f, 2.0f, 4.9286f, 3.4645f, 3.4641f)
                curveTo(4.7053f, 2.2233f, 6.5869f, 2.0338f, 10.0f, 2.0049f)
                moveTo(22.0f, 11.9997f)
                curveTo(22.0f, 7.2856f, 22.0f, 4.9286f, 20.5355f, 3.4641f)
                curveTo(19.2947f, 2.2233f, 17.4131f, 2.0338f, 14.0f, 2.0049f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                curveTo(7.1997f, 22.0f, 5.7996f, 22.0f, 4.7301f, 21.455f)
                curveTo(3.7892f, 20.9757f, 3.0243f, 20.2108f, 2.545f, 19.27f)
                curveTo(2.0f, 18.2004f, 2.0f, 16.8003f, 2.0f, 14.0f)
                curveTo(2.0f, 11.1997f, 2.0f, 9.7996f, 2.545f, 8.7301f)
                curveTo(3.0243f, 7.7892f, 3.7892f, 7.0243f, 4.7301f, 6.545f)
                curveTo(5.7996f, 6.0f, 7.1997f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(16.8003f, 6.0f, 18.2004f, 6.0f, 19.27f, 6.545f)
                curveTo(20.2108f, 7.0243f, 20.9757f, 7.7892f, 21.455f, 8.7301f)
                curveTo(22.0f, 9.7996f, 22.0f, 11.1997f, 22.0f, 14.0f)
                curveTo(22.0f, 16.8003f, 22.0f, 18.2004f, 21.455f, 19.27f)
                curveTo(20.9757f, 20.2108f, 20.2108f, 20.9757f, 19.27f, 21.455f)
                curveTo(18.2004f, 22.0f, 16.8003f, 22.0f, 14.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                lineTo(12.0f, 11.0f)
                moveTo(12.0f, 11.0f)
                lineTo(14.5f, 13.5f)
                moveTo(12.0f, 11.0f)
                lineTo(9.5f, 13.5f)
            }
        }
        .build()
        return _archiveUpMinimlistic!!
    }

private var _archiveUpMinimlistic: ImageVector? = null
