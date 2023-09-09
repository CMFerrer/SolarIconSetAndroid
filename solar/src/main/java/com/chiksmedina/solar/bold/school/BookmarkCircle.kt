package com.chiksmedina.solar.bold.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SchoolGroup

public val SchoolGroup.BookmarkCircle: ImageVector
    get() {
        if (_bookmarkCircle != null) {
            return _bookmarkCircle!!
        }
        _bookmarkCircle = Builder(name = "BookmarkCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(16.0f, 14.0455f)
                verticalLineTo(11.5488f)
                curveTo(16.0f, 9.4045f, 16.0f, 8.3323f, 15.4142f, 7.6662f)
                curveTo(14.8284f, 7.0f, 13.8856f, 7.0f, 12.0f, 7.0f)
                curveTo(10.1144f, 7.0f, 9.1716f, 7.0f, 8.5858f, 7.6662f)
                curveTo(8.0f, 8.3323f, 8.0f, 9.4045f, 8.0f, 11.5488f)
                verticalLineTo(14.0455f)
                curveTo(8.0f, 15.5937f, 8.0f, 16.3679f, 8.3263f, 16.7062f)
                curveTo(8.4819f, 16.8675f, 8.6783f, 16.9688f, 8.8875f, 16.9958f)
                curveTo(9.3262f, 17.0522f, 9.8385f, 16.5425f, 10.8632f, 15.5229f)
                curveTo(11.3161f, 15.0722f, 11.5426f, 14.8469f, 11.8046f, 14.7875f)
                curveTo(11.9336f, 14.7583f, 12.0664f, 14.7583f, 12.1954f, 14.7875f)
                curveTo(12.4574f, 14.8469f, 12.6839f, 15.0722f, 13.1368f, 15.5229f)
                curveTo(14.1615f, 16.5425f, 14.6738f, 17.0522f, 15.1125f, 16.9958f)
                curveTo(15.3217f, 16.9688f, 15.5181f, 16.8675f, 15.6737f, 16.7062f)
                curveTo(16.0f, 16.3679f, 16.0f, 15.5937f, 16.0f, 14.0455f)
                close()
            }
        }
        .build()
        return _bookmarkCircle!!
    }

private var _bookmarkCircle: ImageVector? = null
