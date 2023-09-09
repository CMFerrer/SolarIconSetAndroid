package com.chiksmedina.solar.broken.list

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
import com.chiksmedina.solar.broken.ListGroup

public val ListGroup.SortByAlphabet: ImageVector
    get() {
        if (_sortByAlphabet != null) {
            return _sortByAlphabet!!
        }
        _sortByAlphabet = Builder(name = "SortByAlphabet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                lineTo(3.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                horizontalLineTo(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 17.0f)
                horizontalLineTo(3.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3161f, 16.6922f)
                curveTo(11.1461f, 17.07f, 11.3145f, 17.514f, 11.6922f, 17.6839f)
                curveTo(12.07f, 17.8539f, 12.514f, 17.6855f, 12.6839f, 17.3078f)
                lineTo(11.3161f, 16.6922f)
                close()
                moveTo(16.5f, 7.0f)
                lineTo(17.1839f, 6.6922f)
                curveTo(17.0628f, 6.4231f, 16.7951f, 6.25f, 16.5f, 6.25f)
                curveTo(16.2049f, 6.25f, 15.9372f, 6.4231f, 15.8161f, 6.6922f)
                lineTo(16.5f, 7.0f)
                close()
                moveTo(20.3161f, 17.3078f)
                curveTo(20.486f, 17.6855f, 20.93f, 17.8539f, 21.3078f, 17.6839f)
                curveTo(21.6855f, 17.514f, 21.8539f, 17.07f, 21.6839f, 16.6922f)
                lineTo(20.3161f, 17.3078f)
                close()
                moveTo(19.3636f, 13.3636f)
                lineTo(20.0476f, 13.0559f)
                lineTo(20.0476f, 13.0559f)
                lineTo(19.3636f, 13.3636f)
                close()
                moveTo(13.6364f, 12.6136f)
                curveTo(13.2222f, 12.6136f, 12.8864f, 12.9494f, 12.8864f, 13.3636f)
                curveTo(12.8864f, 13.7779f, 13.2222f, 14.1136f, 13.6364f, 14.1136f)
                verticalLineTo(12.6136f)
                close()
                moveTo(12.6839f, 17.3078f)
                lineTo(17.1839f, 7.3078f)
                lineTo(15.8161f, 6.6922f)
                lineTo(11.3161f, 16.6922f)
                lineTo(12.6839f, 17.3078f)
                close()
                moveTo(21.6839f, 16.6922f)
                lineTo(20.0476f, 13.0559f)
                lineTo(18.6797f, 13.6714f)
                lineTo(20.3161f, 17.3078f)
                lineTo(21.6839f, 16.6922f)
                close()
                moveTo(20.0476f, 13.0559f)
                lineTo(17.1839f, 6.6922f)
                lineTo(15.8161f, 7.3078f)
                lineTo(18.6797f, 13.6714f)
                lineTo(20.0476f, 13.0559f)
                close()
                moveTo(19.3636f, 12.6136f)
                horizontalLineTo(13.6364f)
                verticalLineTo(14.1136f)
                horizontalLineTo(19.3636f)
                verticalLineTo(12.6136f)
                close()
            }
        }
        .build()
        return _sortByAlphabet!!
    }

private var _sortByAlphabet: ImageVector? = null
