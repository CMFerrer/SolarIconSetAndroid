package com.chiksmedina.solar.boldduotone.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsActionGroup

public val ArrowsActionGroup.UploadMinimalistic: ImageVector
    get() {
        if (_uploadMinimalistic != null) {
            return _uploadMinimalistic!!
        }
        _uploadMinimalistic = Builder(name = "UploadMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(3.0f, 14.25f)
                curveTo(3.4142f, 14.25f, 3.75f, 14.5858f, 3.75f, 15.0f)
                curveTo(3.75f, 16.4354f, 3.7516f, 17.4365f, 3.8531f, 18.1919f)
                curveTo(3.9518f, 18.9257f, 4.1322f, 19.3142f, 4.409f, 19.591f)
                curveTo(4.6858f, 19.8678f, 5.0743f, 20.0482f, 5.8081f, 20.1469f)
                curveTo(6.5635f, 20.2484f, 7.5646f, 20.25f, 9.0f, 20.25f)
                horizontalLineTo(15.0f)
                curveTo(16.4354f, 20.25f, 17.4365f, 20.2484f, 18.1919f, 20.1469f)
                curveTo(18.9257f, 20.0482f, 19.3142f, 19.8678f, 19.591f, 19.591f)
                curveTo(19.8678f, 19.3142f, 20.0482f, 18.9257f, 20.1469f, 18.1919f)
                curveTo(20.2484f, 17.4365f, 20.25f, 16.4354f, 20.25f, 15.0f)
                curveTo(20.25f, 14.5858f, 20.5858f, 14.25f, 21.0f, 14.25f)
                curveTo(21.4142f, 14.25f, 21.75f, 14.5858f, 21.75f, 15.0f)
                verticalLineTo(15.0549f)
                curveTo(21.75f, 16.4225f, 21.75f, 17.5248f, 21.6335f, 18.3918f)
                curveTo(21.5125f, 19.2919f, 21.2536f, 20.0497f, 20.6517f, 20.6516f)
                curveTo(20.0497f, 21.2536f, 19.2919f, 21.5125f, 18.3918f, 21.6335f)
                curveTo(17.5248f, 21.75f, 16.4225f, 21.75f, 15.0549f, 21.75f)
                horizontalLineTo(8.9451f)
                curveTo(7.5775f, 21.75f, 6.4752f, 21.75f, 5.6083f, 21.6335f)
                curveTo(4.7081f, 21.5125f, 3.9503f, 21.2536f, 3.3484f, 20.6517f)
                curveTo(2.7464f, 20.0497f, 2.4875f, 19.2919f, 2.3665f, 18.3918f)
                curveTo(2.25f, 17.5248f, 2.25f, 16.4225f, 2.25f, 15.0549f)
                curveTo(2.25f, 15.0366f, 2.25f, 15.0183f, 2.25f, 15.0f)
                curveTo(2.25f, 14.5858f, 2.5858f, 14.25f, 3.0f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(12.2106f, 2.25f, 12.4114f, 2.3385f, 12.5535f, 2.4939f)
                lineTo(16.5535f, 6.8689f)
                curveTo(16.833f, 7.1746f, 16.8118f, 7.649f, 16.5061f, 7.9285f)
                curveTo(16.2004f, 8.208f, 15.726f, 8.1868f, 15.4465f, 7.8811f)
                lineTo(12.75f, 4.9318f)
                verticalLineTo(16.0f)
                curveTo(12.75f, 16.4142f, 12.4142f, 16.75f, 12.0f, 16.75f)
                curveTo(11.5858f, 16.75f, 11.25f, 16.4142f, 11.25f, 16.0f)
                verticalLineTo(4.9318f)
                lineTo(8.5535f, 7.8811f)
                curveTo(8.274f, 8.1868f, 7.7996f, 8.208f, 7.4939f, 7.9285f)
                curveTo(7.1882f, 7.649f, 7.167f, 7.1746f, 7.4465f, 6.8689f)
                lineTo(11.4465f, 2.4939f)
                curveTo(11.5886f, 2.3385f, 11.7894f, 2.25f, 12.0f, 2.25f)
                close()
            }
        }
        .build()
        return _uploadMinimalistic!!
    }

private var _uploadMinimalistic: ImageVector? = null
