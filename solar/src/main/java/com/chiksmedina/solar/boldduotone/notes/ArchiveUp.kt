package com.chiksmedina.solar.boldduotone.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.NotesGroup

public val NotesGroup.ArchiveUp: ImageVector
    get() {
        if (_archiveUp != null) {
            return _archiveUp!!
        }
        _archiveUp = Builder(name = "ArchiveUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 21.0f)
                curveTo(16.3552f, 20.9994f, 18.183f, 20.9738f, 19.3284f, 19.8284f)
                curveTo(20.5f, 18.6569f, 20.5f, 16.7713f, 20.5f, 13.0f)
                verticalLineTo(6.9981f)
                curveTo(20.3548f, 7.0001f, 20.1509f, 7.0001f, 20.0f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.8491f, 7.0001f, 3.6452f, 7.0001f, 3.5f, 6.9981f)
                verticalLineTo(13.0f)
                curveTo(3.5f, 16.7713f, 3.5f, 18.6569f, 4.6716f, 19.8284f)
                curveTo(5.817f, 20.9738f, 7.6448f, 20.9994f, 11.25f, 21.0f)
                lineTo(11.25f, 13.9545f)
                lineTo(9.5575f, 15.8351f)
                curveTo(9.2804f, 16.1429f, 8.8062f, 16.1679f, 8.4983f, 15.8908f)
                curveTo(8.1904f, 15.6137f, 8.1654f, 15.1395f, 8.4425f, 14.8316f)
                lineTo(11.4425f, 11.4983f)
                curveTo(11.5848f, 11.3402f, 11.7874f, 11.25f, 12.0f, 11.25f)
                curveTo(12.2126f, 11.25f, 12.4152f, 11.3402f, 12.5575f, 11.4983f)
                lineTo(15.5575f, 14.8316f)
                curveTo(15.8346f, 15.1395f, 15.8096f, 15.6137f, 15.5017f, 15.8908f)
                curveTo(15.1938f, 16.1679f, 14.7196f, 16.1429f, 14.4425f, 15.8351f)
                lineTo(12.75f, 13.9545f)
                lineTo(12.75f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                curveTo(2.0f, 4.0572f, 2.0f, 3.5858f, 2.2929f, 3.2929f)
                curveTo(2.5858f, 3.0f, 3.0572f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.9428f, 3.0f, 21.4142f, 3.0f, 21.7071f, 3.2929f)
                curveTo(22.0f, 3.5858f, 22.0f, 4.0572f, 22.0f, 5.0f)
                curveTo(22.0f, 5.9428f, 22.0f, 6.4142f, 21.7071f, 6.7071f)
                curveTo(21.4142f, 7.0f, 20.9428f, 7.0f, 20.0f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.0572f, 7.0f, 2.5858f, 7.0f, 2.2929f, 6.7071f)
                curveTo(2.0f, 6.4142f, 2.0f, 5.9428f, 2.0f, 5.0f)
                close()
            }
        }
        .build()
        return _archiveUp!!
    }

private var _archiveUp: ImageVector? = null
