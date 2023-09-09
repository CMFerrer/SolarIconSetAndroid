package com.chiksmedina.solar.outline.essentionalui

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
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.Danger: ImageVector
    get() {
        if (_danger != null) {
            return _danger!!
        }
        _danger = Builder(name = "Danger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.25f)
                curveTo(12.4142f, 6.25f, 12.75f, 6.5858f, 12.75f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(12.75f, 13.4142f, 12.4142f, 13.75f, 12.0f, 13.75f)
                curveTo(11.5858f, 13.75f, 11.25f, 13.4142f, 11.25f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(11.25f, 6.5858f, 11.5858f, 6.25f, 12.0f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.0f)
                curveTo(13.0f, 16.5523f, 12.5523f, 17.0f, 12.0f, 17.0f)
                curveTo(11.4477f, 17.0f, 11.0f, 16.5523f, 11.0f, 16.0f)
                curveTo(11.0f, 15.4477f, 11.4477f, 15.0f, 12.0f, 15.0f)
                curveTo(12.5523f, 15.0f, 13.0f, 15.4477f, 13.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.25f)
                curveTo(11.2954f, 1.25f, 10.6519f, 1.4436f, 9.9486f, 1.7704f)
                curveTo(9.2681f, 2.0866f, 8.4804f, 2.553f, 7.4946f, 3.1369f)
                lineTo(6.7415f, 3.5828f)
                curveTo(5.7553f, 4.1668f, 4.9677f, 4.6332f, 4.3608f, 5.0794f)
                curveTo(3.7332f, 5.5408f, 3.2518f, 6.0131f, 2.9033f, 6.6321f)
                curveTo(2.5555f, 7.2501f, 2.3984f, 7.911f, 2.3231f, 8.6951f)
                curveTo(2.25f, 9.4554f, 2.25f, 10.3865f, 2.25f, 11.556f)
                verticalLineTo(12.444f)
                curveTo(2.25f, 13.6135f, 2.25f, 14.5446f, 2.3231f, 15.3049f)
                curveTo(2.3984f, 16.0891f, 2.5555f, 16.7499f, 2.9033f, 17.3679f)
                curveTo(3.2518f, 17.9869f, 3.7332f, 18.4592f, 4.3608f, 18.9206f)
                curveTo(4.9677f, 19.3668f, 5.7553f, 19.8332f, 6.7415f, 20.4172f)
                lineTo(7.4946f, 20.8632f)
                curveTo(8.4804f, 21.447f, 9.2681f, 21.9135f, 9.9486f, 22.2296f)
                curveTo(10.6519f, 22.5564f, 11.2954f, 22.75f, 12.0f, 22.75f)
                curveTo(12.7046f, 22.75f, 13.3481f, 22.5564f, 14.0514f, 22.2296f)
                curveTo(14.7319f, 21.9134f, 15.5196f, 21.447f, 16.5054f, 20.8632f)
                lineTo(17.2585f, 20.4172f)
                curveTo(18.2446f, 19.8332f, 19.0323f, 19.3668f, 19.6392f, 18.9206f)
                curveTo(20.2669f, 18.4592f, 20.7482f, 17.9869f, 21.0967f, 17.3679f)
                curveTo(21.4445f, 16.7499f, 21.6016f, 16.0891f, 21.6769f, 15.3049f)
                curveTo(21.75f, 14.5446f, 21.75f, 13.6135f, 21.75f, 12.4441f)
                verticalLineTo(11.556f)
                curveTo(21.75f, 10.3866f, 21.75f, 9.4554f, 21.6769f, 8.6951f)
                curveTo(21.6016f, 7.911f, 21.4445f, 7.2501f, 21.0967f, 6.6321f)
                curveTo(20.7482f, 6.0131f, 20.2669f, 5.5408f, 19.6392f, 5.0794f)
                curveTo(19.0323f, 4.6332f, 18.2447f, 4.1668f, 17.2585f, 3.5828f)
                lineTo(16.5054f, 3.1369f)
                curveTo(15.5196f, 2.553f, 14.7319f, 2.0866f, 14.0514f, 1.7704f)
                curveTo(13.3481f, 1.4436f, 12.7046f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(8.2252f, 4.4474f)
                curveTo(9.2524f, 3.8392f, 9.9761f, 3.4116f, 10.5807f, 3.1307f)
                curveTo(11.1702f, 2.8568f, 11.5907f, 2.75f, 12.0f, 2.75f)
                curveTo(12.4093f, 2.75f, 12.8298f, 2.8568f, 13.4193f, 3.1307f)
                curveTo(14.0239f, 3.4116f, 14.7476f, 3.8392f, 15.7748f, 4.4474f)
                lineTo(16.4609f, 4.8538f)
                curveTo(17.4879f, 5.462f, 18.2109f, 5.8911f, 18.7508f, 6.288f)
                curveTo(19.2767f, 6.6747f, 19.581f, 6.9975f, 19.7895f, 7.3679f)
                curveTo(19.9986f, 7.7393f, 20.1199f, 8.1739f, 20.1838f, 8.8385f)
                curveTo(20.2492f, 9.5188f, 20.25f, 10.378f, 20.25f, 11.5937f)
                verticalLineTo(12.4063f)
                curveTo(20.25f, 13.622f, 20.2492f, 14.4812f, 20.1838f, 15.1614f)
                curveTo(20.1199f, 15.8261f, 19.9986f, 16.2607f, 19.7895f, 16.6321f)
                curveTo(19.581f, 17.0025f, 19.2767f, 17.3253f, 18.7508f, 17.712f)
                curveTo(18.2109f, 18.1089f, 17.4879f, 18.538f, 16.4609f, 19.1462f)
                lineTo(15.7748f, 19.5526f)
                curveTo(14.7476f, 20.1608f, 14.0239f, 20.5884f, 13.4193f, 20.8693f)
                curveTo(12.8298f, 21.1432f, 12.4093f, 21.25f, 12.0f, 21.25f)
                curveTo(11.5907f, 21.25f, 11.1702f, 21.1432f, 10.5807f, 20.8693f)
                curveTo(9.9761f, 20.5884f, 9.2524f, 20.1608f, 8.2252f, 19.5526f)
                lineTo(7.5391f, 19.1462f)
                curveTo(6.5121f, 18.538f, 5.7891f, 18.1089f, 5.2492f, 17.712f)
                curveTo(4.7233f, 17.3253f, 4.419f, 17.0025f, 4.2105f, 16.6321f)
                curveTo(4.0015f, 16.2607f, 3.88f, 15.8261f, 3.8162f, 15.1614f)
                curveTo(3.7508f, 14.4812f, 3.75f, 13.622f, 3.75f, 12.4063f)
                verticalLineTo(11.5937f)
                curveTo(3.75f, 10.378f, 3.7508f, 9.5188f, 3.8162f, 8.8385f)
                curveTo(3.88f, 8.1739f, 4.0015f, 7.7393f, 4.2105f, 7.3679f)
                curveTo(4.419f, 6.9975f, 4.7233f, 6.6747f, 5.2492f, 6.288f)
                curveTo(5.7891f, 5.8911f, 6.5121f, 5.462f, 7.5391f, 4.8538f)
                lineTo(8.2252f, 4.4474f)
                close()
            }
        }
        .build()
        return _danger!!
    }

private var _danger: ImageVector? = null
