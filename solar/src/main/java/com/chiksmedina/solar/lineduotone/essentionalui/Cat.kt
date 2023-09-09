package com.chiksmedina.solar.lineduotone.essentionalui

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
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

public val EssentionalUiGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0993f, 10.6602f)
                curveTo(20.2113f, 11.9744f, 19.98f, 13.5815f, 19.9801f, 15.0f)
                curveTo(19.9801f, 18.9062f, 14.7132f, 20.0f, 12.0f, 20.0f)
                curveTo(9.2868f, 20.0f, 4.0199f, 18.9062f, 4.0199f, 15.0f)
                curveTo(4.0199f, 13.5815f, 3.7887f, 11.9744f, 4.9007f, 10.6602f)
                moveTo(19.0993f, 10.6602f)
                curveTo(18.9048f, 10.4303f, 18.6692f, 10.2094f, 18.384f, 10.0f)
                moveTo(19.0993f, 10.6602f)
                curveTo(19.7993f, 11.0634f, 19.9781f, 9.5547f, 19.9801f, 9.0625f)
                verticalLineTo(7.1876f)
                curveTo(19.9801f, 5.5626f, 18.8629f, 5.0001f, 17.9053f, 5.0001f)
                curveTo(16.9477f, 5.0001f, 15.0324f, 6.5625f, 14.394f, 6.5625f)
                curveTo(13.6279f, 6.5625f, 13.4804f, 6.4064f, 12.0f, 6.4064f)
                curveTo(10.5197f, 6.4064f, 10.3721f, 6.5625f, 9.606f, 6.5625f)
                curveTo(8.9676f, 6.5625f, 7.0524f, 5.0f, 6.0948f, 5.0f)
                curveTo(5.1371f, 5.0f, 4.0199f, 5.5625f, 4.0199f, 7.1875f)
                verticalLineTo(9.0625f)
                curveTo(4.0219f, 9.5547f, 4.2007f, 11.0634f, 4.9007f, 10.6602f)
                moveTo(4.9007f, 10.6602f)
                curveTo(5.0952f, 10.4303f, 5.3308f, 10.2094f, 5.616f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.8259f, 15.9999f)
                curveTo(12.8259f, 16.1725f, 12.4649f, 16.3124f, 12.0195f, 16.3124f)
                curveTo(11.5741f, 16.3124f, 11.213f, 16.1725f, 11.213f, 15.9999f)
                curveTo(11.213f, 15.8273f, 11.5741f, 15.6874f, 12.0195f, 15.6874f)
                curveTo(12.4649f, 15.6874f, 12.8259f, 15.8273f, 12.8259f, 15.9999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 13.5938f)
                curveTo(15.5f, 14.0252f, 15.2834f, 14.375f, 15.0161f, 14.375f)
                curveTo(14.7489f, 14.375f, 14.5323f, 14.0252f, 14.5323f, 13.5938f)
                curveTo(14.5323f, 13.1623f, 14.7489f, 12.8125f, 15.0161f, 12.8125f)
                curveTo(15.2834f, 12.8125f, 15.5f, 13.1623f, 15.5f, 13.5938f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5001f, 13.5938f)
                curveTo(9.5001f, 14.0252f, 9.2835f, 14.375f, 9.0162f, 14.375f)
                curveTo(8.749f, 14.375f, 8.5324f, 14.0252f, 8.5324f, 13.5938f)
                curveTo(8.5324f, 13.1623f, 8.749f, 12.8125f, 9.0162f, 12.8125f)
                curveTo(9.2835f, 12.8125f, 9.5001f, 13.1623f, 9.5001f, 13.5938f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0004f, 15.4688f)
                curveTo(21.5165f, 15.1562f, 19.4197f, 14.375f, 18.6133f, 14.375f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.3871f, 17.9688f)
                curveTo(19.9033f, 17.6562f, 18.7742f, 16.875f, 17.9678f, 16.875f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 15.4688f)
                curveTo(2.4839f, 15.1562f, 4.5806f, 14.375f, 5.3871f, 14.375f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.6128f, 17.9688f)
                curveTo(4.0967f, 17.6562f, 5.2257f, 16.875f, 6.0321f, 16.875f)
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
