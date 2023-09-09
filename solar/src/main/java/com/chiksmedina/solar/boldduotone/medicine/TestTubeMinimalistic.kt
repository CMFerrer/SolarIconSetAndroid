package com.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.MedicineGroup

public val MedicineGroup.TestTubeMinimalistic: ImageVector
    get() {
        if (_testTubeMinimalistic != null) {
            return _testTubeMinimalistic!!
        }
        _testTubeMinimalistic = Builder(name = "TestTubeMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1874f, 15.0484f)
                curveTo(1.6042f, 16.6387f, 1.6042f, 19.217f, 3.1874f, 20.8073f)
                curveTo(4.7707f, 22.3976f, 7.3377f, 22.3976f, 8.9209f, 20.8073f)
                lineTo(12.6667f, 17.045f)
                lineTo(10.8946f, 16.3094f)
                curveTo(10.1177f, 15.975f, 9.5799f, 15.2468f, 9.4866f, 14.4031f)
                curveTo(9.3654f, 13.3074f, 8.5042f, 12.4424f, 7.4134f, 12.3207f)
                horizontalLineTo(5.9032f)
                lineTo(3.1874f, 15.0484f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.3623f, 2.2331f)
                curveTo(13.6754f, 1.9213f, 14.1819f, 1.9225f, 14.4936f, 2.2356f)
                lineTo(21.7667f, 9.5408f)
                curveTo(22.0784f, 9.8539f, 22.0773f, 10.3605f, 21.7642f, 10.6722f)
                curveTo(21.4511f, 10.9839f, 20.9446f, 10.9828f, 20.6328f, 10.6697f)
                lineTo(13.3598f, 3.3644f)
                curveTo(13.048f, 3.0513f, 13.0492f, 2.5448f, 13.3623f, 2.2331f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0901f, 4.0975f)
                lineTo(3.1874f, 15.0484f)
                curveTo(1.6042f, 16.6387f, 1.6042f, 19.217f, 3.1874f, 20.8073f)
                curveTo(4.7707f, 22.3975f, 7.3377f, 22.3975f, 8.9209f, 20.8073f)
                lineTo(19.8236f, 9.8564f)
                lineTo(14.0901f, 4.0975f)
                close()
            }
        }
        .build()
        return _testTubeMinimalistic!!
    }

private var _testTubeMinimalistic: ImageVector? = null
