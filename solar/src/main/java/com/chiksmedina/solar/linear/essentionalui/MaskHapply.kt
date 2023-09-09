package com.chiksmedina.solar.linear.essentionalui

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
import com.chiksmedina.solar.linear.EssentionalUiGroup

public val EssentionalUiGroup.MaskHapply: ImageVector
    get() {
        if (_maskHapply != null) {
            return _maskHapply!!
        }
        _maskHapply = Builder(name = "MaskHapply", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                verticalLineTo(6.7189f)
                curveTo(21.0f, 4.529f, 21.0f, 3.434f, 20.2927f, 2.8349f)
                curveTo(19.5855f, 2.2357f, 18.5045f, 2.4159f, 16.3424f, 2.7763f)
                lineTo(15.288f, 2.952f)
                curveTo(13.6477f, 3.2254f, 12.8276f, 3.3621f, 12.0f, 3.3621f)
                curveTo(11.1724f, 3.3621f, 10.3523f, 3.2254f, 8.712f, 2.952f)
                lineTo(7.6576f, 2.7763f)
                curveTo(5.4955f, 2.4159f, 4.4145f, 2.2357f, 3.7073f, 2.8349f)
                curveTo(3.0f, 3.434f, 3.0f, 4.529f, 3.0f, 6.7189f)
                verticalLineTo(12.0f)
                curveTo(3.0f, 17.4903f, 7.239f, 20.1547f, 9.8986f, 21.286f)
                curveTo(10.62f, 21.5929f, 10.9807f, 21.7464f, 12.0f, 21.7464f)
                curveTo(13.0193f, 21.7464f, 13.38f, 21.5929f, 14.1014f, 21.286f)
                curveTo(16.761f, 20.1547f, 21.0f, 17.4903f, 21.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 9.0f)
                curveTo(6.7911f, 8.4174f, 7.5767f, 8.0f, 8.5f, 8.0f)
                curveTo(9.4234f, 8.0f, 10.2089f, 8.4174f, 10.5f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 9.0f)
                curveTo(13.7911f, 8.4174f, 14.5766f, 8.0f, 15.5f, 8.0f)
                curveTo(16.4234f, 8.0f, 17.2089f, 8.4174f, 17.5f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 14.0f)
                curveTo(8.5f, 14.0f, 9.55f, 15.0f, 12.0f, 15.0f)
                curveTo(14.45f, 15.0f, 15.5f, 14.0f, 15.5f, 14.0f)
            }
        }
        .build()
        return _maskHapply!!
    }

private var _maskHapply: ImageVector? = null
