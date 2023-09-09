package com.chiksmedina.solar.boldduotone.sports

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
import com.chiksmedina.solar.boldduotone.SportsGroup

public val SportsGroup.Stretching: ImageVector
    get() {
        if (_stretching != null) {
            return _stretching!!
        }
        _stretching = Builder(name = "Stretching", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.5f)
                curveTo(17.0f, 5.8807f, 15.8807f, 7.0f, 14.5f, 7.0f)
                curveTo(13.1193f, 7.0f, 12.0f, 5.8807f, 12.0f, 4.5f)
                curveTo(12.0f, 3.1193f, 13.1193f, 2.0f, 14.5f, 2.0f)
                curveTo(15.8807f, 2.0f, 17.0f, 3.1193f, 17.0f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5589f, 14.0535f)
                curveTo(18.2318f, 13.7817f, 19.75f, 15.0731f, 19.75f, 16.7679f)
                verticalLineTo(22.0f)
                curveTo(19.75f, 22.4142f, 19.4142f, 22.75f, 19.0f, 22.75f)
                curveTo(18.5858f, 22.75f, 18.25f, 22.4142f, 18.25f, 22.0f)
                verticalLineTo(16.7679f)
                curveTo(18.25f, 15.9975f, 17.5599f, 15.4105f, 16.7995f, 15.5341f)
                lineTo(15.787f, 15.6986f)
                curveTo(15.3781f, 15.7651f, 14.9928f, 15.4875f, 14.9264f, 15.0786f)
                curveTo(14.8599f, 14.6698f, 15.1375f, 14.2845f, 15.5464f, 14.218f)
                lineTo(16.5589f, 14.0535f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5028f, 9.2068f)
                curveTo(11.9875f, 8.5705f, 13.6391f, 9.6596f, 13.6391f, 11.2749f)
                verticalLineTo(13.8953f)
                curveTo(13.6391f, 14.3654f, 13.5186f, 14.8277f, 13.2891f, 15.238f)
                lineTo(10.5768f, 20.0862f)
                curveTo(10.2519f, 20.6669f, 9.7275f, 21.1101f, 9.1007f, 21.3337f)
                lineTo(5.2522f, 22.7065f)
                curveTo(4.8621f, 22.8456f, 4.433f, 22.6422f, 4.2938f, 22.2521f)
                curveTo(4.1546f, 21.8619f, 4.3581f, 21.4328f, 4.7482f, 21.2937f)
                lineTo(8.5968f, 19.9209f)
                curveTo(8.8817f, 19.8192f, 9.12f, 19.6178f, 9.2677f, 19.3538f)
                lineTo(11.98f, 14.5056f)
                curveTo(12.0843f, 14.3191f, 12.1391f, 14.109f, 12.1391f, 13.8953f)
                verticalLineTo(11.2749f)
                curveTo(12.1391f, 10.7364f, 11.5886f, 10.3734f, 11.0937f, 10.5855f)
                lineTo(8.6379f, 11.638f)
                curveTo(8.1464f, 11.8486f, 8.0269f, 12.4911f, 8.4097f, 12.8644f)
                lineTo(9.0238f, 13.4631f)
                curveTo(9.3204f, 13.7522f, 9.3264f, 14.2271f, 9.0372f, 14.5237f)
                curveTo(8.748f, 14.8202f, 8.2732f, 14.8262f, 7.9766f, 14.5371f)
                lineTo(7.3626f, 13.9384f)
                curveTo(6.2141f, 12.8186f, 6.5727f, 10.8911f, 8.047f, 10.2593f)
                lineTo(10.5028f, 9.2068f)
                close()
            }
        }
        .build()
        return _stretching!!
    }

private var _stretching: ImageVector? = null
