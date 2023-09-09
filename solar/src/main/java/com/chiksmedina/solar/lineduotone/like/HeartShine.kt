package com.chiksmedina.solar.lineduotone.like

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
import com.chiksmedina.solar.lineduotone.LikeGroup

public val LikeGroup.HeartShine: ImageVector
    get() {
        if (_heartShine != null) {
            return _heartShine!!
        }
        _heartShine = Builder(name = "HeartShine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                lineTo(4.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                lineTo(22.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                lineTo(6.3431f, 17.657f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.6567f, 6.3438f)
                lineTo(18.0f, 6.0005f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                lineTo(17.657f, 17.657f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.3433f, 6.3438f)
                lineTo(6.0f, 6.0005f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7847f, 15.3538f)
                lineTo(11.2537f, 14.7686f)
                lineTo(10.7847f, 15.3538f)
                close()
                moveTo(12.0f, 9.901f)
                lineTo(11.4554f, 10.4166f)
                curveTo(11.597f, 10.5662f, 11.794f, 10.651f, 12.0f, 10.651f)
                curveTo(12.206f, 10.651f, 12.403f, 10.5662f, 12.5446f, 10.4166f)
                lineTo(12.0f, 9.901f)
                close()
                moveTo(13.2153f, 15.3538f)
                lineTo(13.6843f, 15.9391f)
                lineTo(13.6843f, 15.9391f)
                lineTo(13.2153f, 15.3538f)
                close()
                moveTo(11.2537f, 14.7686f)
                curveTo(10.621f, 14.2616f, 10.0075f, 13.8239f, 9.5158f, 13.2611f)
                curveTo(9.0498f, 12.7276f, 8.75f, 12.1383f, 8.75f, 11.3796f)
                horizontalLineTo(7.25f)
                curveTo(7.25f, 12.5983f, 7.7541f, 13.5245f, 8.3862f, 14.248f)
                curveTo(8.9926f, 14.9422f, 9.7714f, 15.5029f, 10.3157f, 15.9391f)
                lineTo(11.2537f, 14.7686f)
                close()
                moveTo(8.75f, 11.3796f)
                curveTo(8.75f, 10.6647f, 9.1467f, 10.0958f, 9.6411f, 9.866f)
                curveTo(10.0847f, 9.6599f, 10.7461f, 9.6674f, 11.4554f, 10.4166f)
                lineTo(12.5446f, 9.3853f)
                curveTo(11.454f, 8.2334f, 10.1154f, 7.9916f, 9.009f, 8.5057f)
                curveTo(7.9533f, 8.9963f, 7.25f, 10.1171f, 7.25f, 11.3796f)
                horizontalLineTo(8.75f)
                close()
                moveTo(10.3157f, 15.9391f)
                curveTo(10.5164f, 16.0999f, 10.7605f, 16.2953f, 11.0151f, 16.4465f)
                curveTo(11.269f, 16.5974f, 11.6065f, 16.75f, 12.0f, 16.75f)
                verticalLineTo(15.25f)
                curveTo(11.9935f, 15.25f, 11.931f, 15.2459f, 11.7811f, 15.1569f)
                curveTo(11.6318f, 15.0682f, 11.4683f, 14.9406f, 11.2537f, 14.7686f)
                lineTo(10.3157f, 15.9391f)
                close()
                moveTo(13.6843f, 15.9391f)
                curveTo(14.2286f, 15.5029f, 15.0074f, 14.9422f, 15.6138f, 14.248f)
                curveTo(16.2459f, 13.5245f, 16.75f, 12.5983f, 16.75f, 11.3796f)
                horizontalLineTo(15.25f)
                curveTo(15.25f, 12.1383f, 14.9502f, 12.7276f, 14.4842f, 13.2611f)
                curveTo(13.9925f, 13.8239f, 13.379f, 14.2616f, 12.7463f, 14.7686f)
                lineTo(13.6843f, 15.9391f)
                close()
                moveTo(16.75f, 11.3796f)
                curveTo(16.75f, 10.1171f, 16.0467f, 8.9963f, 14.991f, 8.5057f)
                curveTo(13.8846f, 7.9916f, 12.546f, 8.2334f, 11.4554f, 9.3853f)
                lineTo(12.5446f, 10.4166f)
                curveTo(13.2539f, 9.6674f, 13.9153f, 9.6599f, 14.3589f, 9.866f)
                curveTo(14.8533f, 10.0958f, 15.25f, 10.6647f, 15.25f, 11.3796f)
                horizontalLineTo(16.75f)
                close()
                moveTo(12.7463f, 14.7686f)
                curveTo(12.5317f, 14.9406f, 12.3682f, 15.0682f, 12.2189f, 15.1569f)
                curveTo(12.069f, 15.2459f, 12.0065f, 15.25f, 12.0f, 15.25f)
                verticalLineTo(16.75f)
                curveTo(12.3935f, 16.75f, 12.731f, 16.5974f, 12.9849f, 16.4465f)
                curveTo(13.2395f, 16.2953f, 13.4836f, 16.0999f, 13.6843f, 15.9391f)
                lineTo(12.7463f, 14.7686f)
                close()
            }
        }
        .build()
        return _heartShine!!
    }

private var _heartShine: ImageVector? = null
