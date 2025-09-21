package dev.chiksmedina.solar.lineduotone.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.SportsGroup

val SportsGroup.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }
        _running = Builder(
            name = "Running", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.5f, 4.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 17.0f)
                lineTo(7.9992f, 18.2009f)
                curveTo(7.262f, 19.0856f, 6.8934f, 19.5279f, 6.3895f, 19.764f)
                curveTo(5.8855f, 20.0f, 5.3097f, 20.0f, 4.1581f, 20.0f)
                horizontalLineTo(3.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.4357f, 8.8207f)
                lineTo(5.0652f, 8.1686f)
                lineTo(5.0652f, 8.1686f)
                lineTo(5.4357f, 8.8207f)
                close()
                moveTo(3.6295f, 8.9844f)
                curveTo(3.2694f, 9.189f, 3.1433f, 9.6468f, 3.3479f, 10.007f)
                curveTo(3.5525f, 10.3671f, 4.0104f, 10.4932f, 4.3705f, 10.2885f)
                lineTo(3.6295f, 8.9844f)
                close()
                moveTo(15.7502f, 10.1255f)
                lineTo(15.1262f, 10.5415f)
                lineTo(15.1262f, 10.5415f)
                lineTo(15.7502f, 10.1255f)
                close()
                moveTo(15.8125f, 10.2189f)
                lineTo(16.4366f, 9.8029f)
                lineTo(16.4366f, 9.8029f)
                lineTo(15.8125f, 10.2189f)
                close()
                moveTo(10.9688f, 6.6538f)
                lineTo(11.0462f, 5.9078f)
                lineTo(11.0462f, 5.9078f)
                lineTo(10.9688f, 6.6538f)
                close()
                moveTo(10.7398f, 6.6364f)
                lineTo(10.7065f, 7.3857f)
                lineTo(10.7065f, 7.3857f)
                lineTo(10.7398f, 6.6364f)
                close()
                moveTo(10.1548f, 6.6737f)
                lineTo(10.0522f, 5.9307f)
                lineTo(10.0522f, 5.9307f)
                lineTo(10.1548f, 6.6737f)
                close()
                moveTo(21.0f, 12.7501f)
                curveTo(21.4142f, 12.7501f, 21.75f, 12.4143f, 21.75f, 12.0001f)
                curveTo(21.75f, 11.5859f, 21.4142f, 11.2501f, 21.0f, 11.2501f)
                verticalLineTo(12.7501f)
                close()
                moveTo(5.0652f, 8.1686f)
                lineTo(3.6295f, 8.9844f)
                lineTo(4.3705f, 10.2885f)
                lineTo(5.8062f, 9.4728f)
                lineTo(5.0652f, 8.1686f)
                close()
                moveTo(15.1262f, 10.5415f)
                lineTo(15.1885f, 10.635f)
                lineTo(16.4366f, 9.8029f)
                lineTo(16.3742f, 9.7094f)
                lineTo(15.1262f, 10.5415f)
                close()
                moveTo(11.0462f, 5.9078f)
                curveTo(10.9438f, 5.8972f, 10.853f, 5.8907f, 10.773f, 5.8871f)
                lineTo(10.7065f, 7.3857f)
                curveTo(10.7559f, 7.3878f, 10.8172f, 7.3921f, 10.8914f, 7.3998f)
                lineTo(11.0462f, 5.9078f)
                close()
                moveTo(5.8062f, 9.4728f)
                curveTo(8.1245f, 8.1556f, 9.192f, 7.5637f, 10.2574f, 7.4166f)
                lineTo(10.0522f, 5.9307f)
                curveTo(8.6331f, 6.1267f, 7.2734f, 6.9139f, 5.0652f, 8.1686f)
                lineTo(5.8062f, 9.4728f)
                close()
                moveTo(19.1407f, 12.7501f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.2501f)
                horizontalLineTo(19.1407f)
                verticalLineTo(12.7501f)
                close()
                moveTo(10.773f, 5.8871f)
                curveTo(10.5099f, 5.8755f, 10.2617f, 5.9018f, 10.0522f, 5.9307f)
                lineTo(10.2574f, 7.4166f)
                curveTo(10.4355f, 7.392f, 10.5786f, 7.38f, 10.7065f, 7.3857f)
                lineTo(10.773f, 5.8871f)
                close()
                moveTo(15.1885f, 10.635f)
                curveTo(16.0695f, 11.9564f, 17.5525f, 12.7501f, 19.1407f, 12.7501f)
                verticalLineTo(11.2501f)
                curveTo(18.0541f, 11.2501f, 17.0393f, 10.707f, 16.4366f, 9.8029f)
                lineTo(15.1885f, 10.635f)
                close()
                moveTo(16.3742f, 9.7094f)
                curveTo(15.1968f, 7.9433f, 13.4289f, 6.1551f, 11.0462f, 5.9078f)
                lineTo(10.8914f, 7.3998f)
                curveTo(12.5939f, 7.5765f, 14.0254f, 8.8904f, 15.1262f, 10.5415f)
                lineTo(16.3742f, 9.7094f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.9999f, 8.5f)
                lineTo(11.7792f, 11.2756f)
                curveTo(10.9427f, 12.321f, 10.5245f, 12.8438f, 10.4578f, 13.413f)
                curveTo(10.4203f, 13.733f, 10.4607f, 14.0573f, 10.5755f, 14.3584f)
                curveTo(10.7797f, 14.8939f, 11.3133f, 15.2981f, 12.3805f, 16.1066f)
                curveTo(13.1935f, 16.7225f, 13.5999f, 17.0304f, 13.8754f, 17.4329f)
                curveTo(14.0325f, 17.6625f, 14.1569f, 17.9129f, 14.245f, 18.1767f)
                curveTo(14.3996f, 18.6394f, 14.3996f, 19.1493f, 14.3996f, 20.1692f)
                verticalLineTo(21.9998f)
            }
        }
            .build()
        return _running!!
    }

private var _running: ImageVector? = null
